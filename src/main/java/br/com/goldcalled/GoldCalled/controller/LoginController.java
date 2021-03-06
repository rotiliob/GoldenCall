package br.com.goldcalled.GoldCalled.controller;

import br.com.goldcalled.GoldCalled.repository.UsuarioRepository;
import br.com.goldcalled.GoldCalled.vo.Usuario;
import br.com.goldcalled.GoldCalled.vo.UsuarioLogado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {

    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    LoginController loginController;

    @RequestMapping("/")
    public String loginForm() {
        return "index";
    }

    @RequestMapping("logout")
    public String logout(){ return loginController.loginForm(); }

    @PostMapping("logar")
    public String efetuarLogin(@ModelAttribute Usuario usuario){
        Usuario usuarioBanco = usuarioRepository.findByUsuario(usuario.getLogin());
        if (usuarioBanco == null)
            return loginForm();

        if (usuario.getLogin().equalsIgnoreCase(usuarioBanco.getLogin()) &&
                usuario.getSenha().equalsIgnoreCase(usuarioBanco.getSenha()) &&
                usuarioBanco.getTipoUsuario().equalsIgnoreCase("usuario")){
            UsuarioLogado.usuario = usuarioBanco;
            return "/usuario/usuarioIndex";
        }else if (usuario.getLogin().equalsIgnoreCase(usuarioBanco.getLogin()) &&
                usuario.getSenha().equalsIgnoreCase(usuarioBanco.getSenha()) &&
                usuarioBanco.getTipoUsuario().equalsIgnoreCase("administrador")){
            UsuarioLogado.usuario = usuarioBanco;
           return "/administrador/administradorIndex";
        }else if (usuario.getLogin().equalsIgnoreCase(usuarioBanco.getLogin()) &&
                usuario.getSenha().equalsIgnoreCase(usuarioBanco.getSenha()) &&
                usuarioBanco.getTipoUsuario().equalsIgnoreCase("tecnico")){
            UsuarioLogado.usuario = usuarioBanco;
            return "/tecnico/tecnicoIndex";
        }else {
            return loginForm();
        }
    }
}
