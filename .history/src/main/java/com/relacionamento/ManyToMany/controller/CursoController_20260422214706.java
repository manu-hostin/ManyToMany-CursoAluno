package com.relacionamento.ManyToMany.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.relacionamento.ManyToMany.DTO.CursoRequisicao;
import com.relacionamento.ManyToMany.DTO.CursoResposta;
import com.relacionamento.ManyToMany.service.CursoService;

import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;
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
    public ResponseEntity<CursoResposta> buscarCurso (@Param CursoRequisicao curso) {
        return ResponseEntity.status(HttpStatus.ACCEPTED)
            .body(service.cadastrarCurso(curso));
    }
}
