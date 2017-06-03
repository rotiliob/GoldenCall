package br.com.goldcalled.GoldCalled.repository;

import br.com.goldcalled.GoldCalled.vo.Chamado;
import br.com.goldcalled.GoldCalled.vo.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChamdoRepository extends CrudRepository<Chamado,Long> {
}
