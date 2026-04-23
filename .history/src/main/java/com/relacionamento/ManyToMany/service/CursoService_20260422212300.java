package com.relacionamento.ManyToMany.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.relacionamento.ManyToMany.DTO.CursoRequisicao;
import com.relacionamento.ManyToMany.DTO.CursoResposta;
import com.relacionamento.ManyToMany.mapper.CursoMapper;
import com.relacionamento.ManyToMany.model.Aluno;
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

    public CursoResposta atualizarCursoResposta (int id, Aluno aluno) {
        Curso curso = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Curso não existe!"));

        List<Aluno> lista = new ArrayList<>();
        lista = curso.getAlunos();
        lista.add(aluno);

        curso.setAlunos(lista);
        

        return mapper.paraResposta(curso);
    }

    public CursoResposta buscarCurso (int id) {
        Curso curso = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Curso não existe!"));

        return mapper.paraResposta(curso);
    }

}
