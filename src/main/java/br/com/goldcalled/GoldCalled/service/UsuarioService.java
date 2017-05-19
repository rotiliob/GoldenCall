package br.com.goldcalled.GoldCalled.service;


import br.com.goldcalled.GoldCalled.repository.UsuarioRepository;
import br.com.goldcalled.GoldCalled.vo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario findById(long id) {
        return usuarioRepository.findOne(id);
    }

    public Iterable<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public void delete(long id){
        usuarioRepository.delete(id);
    }

    public Usuario getUsuarioByLogin(String usuario){ return usuarioRepository.findByUsuario(usuario); }
}
