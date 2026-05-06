package com.mfs.aula.controllers;


import com.mfs.aula.models.PessoaModel;
import com.mfs.aula.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

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
