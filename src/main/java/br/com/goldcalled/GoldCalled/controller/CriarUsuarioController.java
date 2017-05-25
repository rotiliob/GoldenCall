package br.com.goldcalled.GoldCalled.controller;


import br.com.goldcalled.GoldCalled.repository.PessoaRepository;
import br.com.goldcalled.GoldCalled.repository.UsuarioRepository;
import br.com.goldcalled.GoldCalled.service.PessoaService;
import br.com.goldcalled.GoldCalled.service.UsuarioService;

import br.com.goldcalled.GoldCalled.vo.Pessoa;
import br.com.goldcalled.GoldCalled.vo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CriarUsuarioController {

    @Autowired
    UsuarioService usuarioService;
    @Autowired
    UsuarioRepository usuarioRepository;

    @RequestMapping("/cadusuario")
    public String novoUsuario() {
        return "/cadusuario";
    }
    @PostMapping("/criar")
    public String criar(@ModelAttribute Usuario usuario) {
        Iterable<Usuario> usuarioBanco = usuarioRepository.findAll();

        Usuario getUsuarioNome = new Usuario();

        for ( Usuario usuario1 : usuarioBanco){
            getUsuarioNome = usuario1;
        }

        if (usuario.getLogin().equalsIgnoreCase(getUsuarioNome.getLogin())){
            return "index";
        }

        if (usuario.getSenha().length() <= 3)
            return "index";


        usuarioService.save(usuario);

        return "index";
    }


}
