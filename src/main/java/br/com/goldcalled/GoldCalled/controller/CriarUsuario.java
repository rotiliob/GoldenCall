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
public class CriarUsuario {


    @Autowired
    PessoaService pessoaService;
    @Autowired
    UsuarioService usuarioService;
    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    PessoaRepository pessoaRepository;

    @RequestMapping("/NovoUsuario")
    public String novoUsuario() {
        return "/NovoUsuario";
    }
    @PostMapping("/criar")
    public String criar(@ModelAttribute Usuario usuario) {
        Iterable<Usuario> usuarioBanco = usuarioRepository.findAll();
        Iterable<Pessoa> pessoaBanco =  pessoaRepository.findAll();

        Usuario getUsuarioNome = new Usuario();
        Pessoa getPessoaNome = new Pessoa();

        for ( Usuario usuario1 : usuarioBanco){
            getUsuarioNome = usuario1;
        }
        for (Pessoa pessoa : pessoaBanco){
            getPessoaNome = pessoa;
        }

        if (usuario.getLogin().equalsIgnoreCase(getUsuarioNome.getLogin())){
            return "index";
        }

        if (usuario.getSenha().length() <= 3)
            return "index";

        pessoaService.save(usuario.getPessoa());
        usuarioService.save(usuario);

        return "index";
    }


}
