package br.com.goldcalled.GoldCalled.controller;

import br.com.goldcalled.GoldCalled.repository.UsuarioRepository;
import br.com.goldcalled.GoldCalled.vo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @RequestMapping("/")
    public String loginForm() {
        return "index";
    }

    @RequestMapping("logar")
    public String efetuarLogin(Usuario usuario){
        Usuario usuarioBanco = usuarioRepository.findByUsuario(usuario.getLogin());

        if (usuario.getLogin().equalsIgnoreCase(usuarioBanco.getLogin()) &&
                usuario.getSenha().equalsIgnoreCase(usuarioBanco.getSenha()) &&
                usuarioBanco.getTipoUsuario().equalsIgnoreCase("usuario")){
            return "/usuario/usuarioIndex";
        }else if (usuario.getLogin().equalsIgnoreCase(usuarioBanco.getLogin()) &&
                usuario.getSenha().equalsIgnoreCase(usuarioBanco.getSenha()) &&
                usuarioBanco.getTipoUsuario().equalsIgnoreCase("administrador")){
           return "/administrador/administradorIndex";
        }else if (usuario.getLogin().equalsIgnoreCase(usuarioBanco.getLogin()) &&
                usuario.getSenha().equalsIgnoreCase(usuarioBanco.getSenha()) &&
                usuarioBanco.getTipoUsuario().equalsIgnoreCase("tecnico")){
            return "/tecnico/tecnicoIndex";
        }else {
            return loginForm();
        }
    }
}
