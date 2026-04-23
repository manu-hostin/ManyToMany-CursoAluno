package com.relacionamento.ManyToMany.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.relacionamento.ManyToMany.DTO.CursoRequisicao;
import com.relacionamento.ManyToMany.DTO.CursoResposta;
import com.relacionamento.ManyToMany.service.CursoService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/curso")
@RequiredArgsConstructor
public class CursoController {
    
    private CursoService service;

    @PostMapping
    public ResponseEntity<CursoResposta> cadastrarCurso (@Valid @RequestBody CursoRequisicao curso) {
        return ResponseEntity.status(HttpStatus.ACCEPTED)
            .body(service.cadastrarCurso(curso));
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<CursoResposta> buscarCurso (@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.OK)
            .body(service.buscarCurso(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CursoResposta> atualizarCurso (@PathVariable int id, @PathVariable) {
        return ResponseEntity.status(HttpStatus.OK)
            .body(service.atualizarCursoResposta(id, aluno));
    }
}
