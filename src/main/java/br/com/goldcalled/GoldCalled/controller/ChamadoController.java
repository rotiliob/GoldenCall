package br.com.goldcalled.GoldCalled.controller;

import br.com.goldcalled.GoldCalled.repository.ChamdoRepository;
import br.com.goldcalled.GoldCalled.repository.UsuarioRepository;
import br.com.goldcalled.GoldCalled.service.ChamadoService;
import br.com.goldcalled.GoldCalled.service.UsuarioService;
import br.com.goldcalled.GoldCalled.vo.Chamado;
import br.com.goldcalled.GoldCalled.vo.Usuario;
import br.com.goldcalled.GoldCalled.vo.UsuarioLogado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Controller
public class ChamadoController {

    @Autowired
    ChamadoService chamdoService;

    @Autowired
    ChamdoRepository chamdoRepository;

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    UsuarioRepository usuarioRepository;

    @RequestMapping("/usuario/usuarioIndex")
    public String novoChamado() {
        return "/usuario/usuarioIndex";
    }

    @PostMapping("/criarChamado")
    public String criarChamado(@ModelAttribute Chamado chamado) {
        Iterable<Usuario> usuarioBanco = usuarioRepository.findAll();

        for (Usuario usuario1 : usuarioBanco) {

            if (UsuarioLogado.usuario.getTipoUsuario().equalsIgnoreCase("usuario") && usuario1.getId() == Long.parseLong(chamado.getMatricula())) {
                chamado.setUsuario(usuario1);
                chamado.setDataCriacao(LocalDate.now());
                chamdoService.save(chamado);
            }
        }

        return "usuario/confirmacaoChamadoAberto";
    }
    @RequestMapping("usuario/chamadosRealizadosUsuario")
    public String listChamado(@ModelAttribute Chamado chamado, Model model){

        Iterable<Chamado> chamados = chamdoRepository.findAll();
        model.addAttribute("chamados", chamados);

        return "usuario/chamadosRealizadosUsuario";
    }

    @GetMapping("usuario/visualizaChamado/{id}")
    public String visualizaChamado(@PathVariable Long id,  Model model){

        model.addAttribute("chamado",chamdoService.findById(id));
        return "usuario/visualizaChamado";
    }
    //---------------------------------------------------------------------//
    //--------------------------TecnicoController--------------------------//
    //---------------------------------------------------------------------//
    @RequestMapping("/tecnico/tecnicoIndex")
    public String chamadoTec() {
        return "/tecnico/tecnicoIndex";
    }


    @RequestMapping("tecnico/listaChamadoTec")
    public String listChamadoTec(@ModelAttribute Chamado chamado, Model model){

        Iterable<Chamado> chamados = chamdoRepository.findAll();
        model.addAttribute("chamados", chamados);

        return "tecnico/listaChamadoTec";
    }

    @GetMapping("tecnico/listaChamadoTec/{id}")
    public String visualizaChamadoTec(@PathVariable Long id, Model model){

        model.addAttribute("chamado",chamdoService.findById(id));
        return "tecnico/atendeChamado";
    }

    @RequestMapping("tecnico/listaChamadoTecConcluido")
    public String listChamadoTecConcluido(@ModelAttribute Chamado chamado, Model model){

        Iterable<Chamado> chamados = chamdoRepository.findAll();
        model.addAttribute("chamados", chamados);

        return "tecnico/listaChamadoTecConcluido";
    }

    @PostMapping("/concluiChamado")
    public String concluiChamado(@ModelAttribute Chamado chamado, Model model) {

        final Chamado chamado1 = chamdoService.findById(chamado.getId());

        if (chamado1!=null &&
                UsuarioLogado.usuario.getTipoUsuario().equalsIgnoreCase("tecnico")) {
            chamado1.setDataConclusao(LocalDate.now());
            chamado1.setStatus("Concluido");
            chamado1.setParecerTecnico(chamado.getParecerTecnico());
            chamdoService.save(chamado1);
        }


        return listChamadoTecConcluido(chamado,model);
    }
    // -------------------------------------------------------------------------------//
    // ---------------------------AdministradorController-----------------------------//
    // -------------------------------------------------------------------------------//
    @RequestMapping("/administrador/administradorIndex")
    public String inicioAdmin() {
        return "/administrador/administradorIndex";
    }

    @RequestMapping("administrador/listaChamadosAdmin")
    public String listChamadoAdmin(@ModelAttribute Chamado chamado, Model model){

        Iterable<Chamado> chamados = chamdoRepository.findAll();
        model.addAttribute("chamados", chamados);

        return "administrador/listaChamadosAdmin";
    }

    @GetMapping("administrador/visualizaChamadoAdmin/{id}")
    public String visualizaChamadoAdmin(@PathVariable Long id, Model model){

        model.addAttribute("chamado",chamdoService.findById(id));
        return "/administrador/visualizaChamadoAdmin";
    }

}
