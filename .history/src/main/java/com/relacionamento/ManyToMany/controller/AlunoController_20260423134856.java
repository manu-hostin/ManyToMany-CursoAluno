package com.relacionamento.ManyToMany.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.relacionamento.ManyToMany.DTO.AlunoRequisicao;
import com.relacionamento.ManyToMany.DTO.AlunoResposta;
import com.relacionamento.ManyToMany.service.AlunoService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/aluno")
@AllArgsConstructor
public class AlunoController {
    
    private AlunoService service;

    @PostMapping
    public ResponseEntity<AlunoResposta> cadastrarAluno (@Valid @RequestBody AlunoRequisicao requisicao) {
        return ResponseEntity.status(HttpStatus.ACCEPTED)
            .body(service.cadastrarAluno(requisicao));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AlunoResposta> buscarAluno (@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.OK)
            .body(service.buscarAluno(id));
    }
}
