package br.com.goldcalled.GoldCalled.repository;

import br.com.goldcalled.GoldCalled.vo.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,Long>{
    @Query(value = "SELECT * FROM Usuario WHERE nome_usuario =?1",nativeQuery = true)
    Usuario findByUsuario(final String usuario);
}

