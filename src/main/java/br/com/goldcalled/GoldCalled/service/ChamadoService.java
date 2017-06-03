package br.com.goldcalled.GoldCalled.service;

import br.com.goldcalled.GoldCalled.repository.ChamdoRepository;
import br.com.goldcalled.GoldCalled.repository.UsuarioRepository;
import br.com.goldcalled.GoldCalled.vo.Chamado;
import br.com.goldcalled.GoldCalled.vo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChamadoService {
    @Autowired
    ChamdoRepository chamdoRepository;
    @Autowired
    UsuarioRepository usuarioRepository;

    public Chamado findById(long id) {
        return chamdoRepository.findOne(id);
    }

    public Iterable<Chamado> findAll() {
        return chamdoRepository.findAll();
    }

    public Usuario saveUsuario(Usuario usuario){ return usuarioRepository.save(usuario); }

    public Chamado save(Chamado chamado){return chamdoRepository.save(chamado);}

    public void delete(long id){
        chamdoRepository.delete(id);
    }

}
