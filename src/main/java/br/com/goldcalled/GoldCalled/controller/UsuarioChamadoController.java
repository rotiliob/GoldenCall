package br.com.goldcalled.GoldCalled.controller;

import br.com.goldcalled.GoldCalled.repository.ChamdoRepository;
import br.com.goldcalled.GoldCalled.repository.UsuarioRepository;
import br.com.goldcalled.GoldCalled.service.ChamadoService;
import br.com.goldcalled.GoldCalled.service.UsuarioService;
import br.com.goldcalled.GoldCalled.vo.Chamado;
import br.com.goldcalled.GoldCalled.vo.Usuario;
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
public class UsuarioChamadoController {

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

            if (usuario1.getId() == Long.parseLong(chamado.getMatricula())) {
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

}
