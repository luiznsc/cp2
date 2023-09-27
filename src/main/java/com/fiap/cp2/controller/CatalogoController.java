package com.fiap.cp2.controller;

import com.fiap.cp2.filme.DadosCadastrosFilme;
import com.fiap.cp2.filme.Filme;
import com.fiap.cp2.filme.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/catalogofilmes")
public class CatalogoController {

    @Autowired
    private FilmeRepository repository;

    @PostMapping
    public void register(@RequestBody DadosCadastrosFilme dados){
        repository.save(new Filme(dados));
    }
}

