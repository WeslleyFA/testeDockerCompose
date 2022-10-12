package com.weslley.estudoDocker.controllers;

import com.weslley.estudoDocker.entities.Pessoa;
import com.weslley.estudoDocker.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public ResponseEntity<Pessoa> salva(String nome){
        Pessoa p = pessoaService.salva(nome);
        return ResponseEntity.ok(p);
    }
}
