package br.com.goldcalled.GoldCalled.repository;


import br.com.goldcalled.GoldCalled.vo.Pessoa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa,Long>{}
