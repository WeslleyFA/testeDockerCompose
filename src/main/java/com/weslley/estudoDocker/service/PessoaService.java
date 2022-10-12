package com.weslley.estudoDocker.service;

import com.weslley.estudoDocker.entities.Pessoa;
import com.weslley.estudoDocker.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa salva(String nome){
        return pessoaRepository.save(new Pessoa(nome));
    }
}
