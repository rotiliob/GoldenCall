package br.com.goldcalled.GoldCalled.controller;

import br.com.goldcalled.GoldCalled.service.PessoaService;
import br.com.goldcalled.GoldCalled.vo.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
    @Autowired
    private PessoaService pessoaService;

    @RequestMapping(value = {"/","index"})
    public String index(Model model){
        System.out.println(pessoaService.findAll());
        model.addAttribute("pessoa",pessoaService.findAll());
        return  "pessoa/index";
    }

    @RequestMapping(value = "create")
    public String create(){
        return "pessoa/create";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(Pessoa pessoa){
        pessoaService.save(pessoa);
        return "redirect:index";
    }

    @RequestMapping(value = "edit/{id}")
    public String edit(@PathVariable Long id,Model model){
        model.addAttribute("pessoa",pessoaService.findById(id));
        return "redirect:index";
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update(Pessoa pessoa){
        pessoaService.save(pessoa);
        return "redirect:index";
    }

    @RequestMapping("/teste")
    public String test(){
        return "Olá mundo!";
    }
}
