package com.mfs.aula.controllers;


import com.mfs.aula.models.PessoaModel;
import com.mfs.aula.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/pessoas")
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    @GetMapping
    List<PessoaModel> findAll(){
        return pessoaService.findAll();
    }
    @PostMapping
    public PessoaModel criarPessoa(@RequestBody PessoaModel pessoaModel){
        return pessoaService.criarPessoa(pessoaModel);
    }
}
