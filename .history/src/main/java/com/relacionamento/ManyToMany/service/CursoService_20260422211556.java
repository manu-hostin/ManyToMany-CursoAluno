package com.relacionamento.ManyToMany.service;

import org.springframework.stereotype.Service;

import com.relacionamento.ManyToMany.DTO.CursoResposta;
import com.relacionamento.ManyToMany.mapper.CursoMapper;
import com.relacionamento.ManyToMany.model.Curso;
import com.relacionamento.ManyToMany.repository.CursoRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CursoService {
    
    private final CursoRepository repository;
    private final CursoMapper mapper;

    public CursoResposta cadastrarCurso (CursoRequisicao requisicao) {
        Curso curso = repository.save(mapper.paraEntidade(requisicao));

        return mapper.paraResposta(curso);
    }

    

}
