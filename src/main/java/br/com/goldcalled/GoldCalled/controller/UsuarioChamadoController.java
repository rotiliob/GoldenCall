package br.com.goldcalled.GoldCalled.controller;

import br.com.goldcalled.GoldCalled.repository.UsuarioRepository;
import br.com.goldcalled.GoldCalled.service.ChamadoService;
import br.com.goldcalled.GoldCalled.service.UsuarioService;
import br.com.goldcalled.GoldCalled.vo.Chamado;
import br.com.goldcalled.GoldCalled.vo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Controller
public class UsuarioChamadoController {

    @Autowired
    ChamadoService chamdoService;

    @Autowired
    UsuarioService usuarioService;
    @Autowired
    UsuarioRepository usuarioRepository;

    @RequestMapping("/usuario/usuarioIndex")
    public String novoChamado() {
        return "/usuario/usuarioIndex";
    }

    @PostMapping("/criarChamado")
    public String criar(@ModelAttribute Chamado chamado) {
        Iterable<Usuario> usuarioBanco = usuarioRepository.findAll();

        for (Usuario usuario1 : usuarioBanco) {

            if (usuario1.getId() == Long.parseLong(chamado.getMatricula())) {
                chamado.setUsuario(usuario1);
                chamado.setDataCriacao(LocalDate.now());
                chamdoService.save(chamado);
            }
        }

        return "usuario/usuarioIndex";
    }
}
