package br.com.goldcalled.GoldCalled.service;


import br.com.goldcalled.GoldCalled.repository.PessoaRepository;
import br.com.goldcalled.GoldCalled.vo.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;

    public Pessoa findById(long id) {
        return pessoaRepository.findOne(id);
    }

    public Iterable<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }

    public Pessoa save(Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    public void delete(long id){
        pessoaRepository.delete(id);
    }


}