package com.relacionamento.ManyToMany.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.relacionamento.ManyToMany.DTO.AlunoRequisicao;
import com.relacionamento.ManyToMany.DTO.AlunoResposta;
import com.relacionamento.ManyToMany.service.AlunoService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/aluno")
@RequiredArgsConstructor
public class AlunoController {
    
    private AlunoService service;

    @PostMapping
    public ResponseEntity<AlunoResposta> cadastrarAluno (@Valid @RequestBody AlunoRequisicao requisicao) {
        return ResponseEntity.status(HttpStatus.ACCEPTED)
            .body(service.)
    }

}
