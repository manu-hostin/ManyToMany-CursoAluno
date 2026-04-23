package com.relacionamento.ManyToMany.service;

import org.springframework.stereotype.Service;

import com.relacionamento.ManyToMany.DTO.AlunoRequisicao;
import com.relacionamento.ManyToMany.DTO.AlunoResposta;
import com.relacionamento.ManyToMany.mapper.AlunoMapper;
import com.relacionamento.ManyToMany.model.Aluno;
import com.relacionamento.ManyToMany.repository.AlunoRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AlunoService {

    private final AlunoRepository repository;
    private final AlunoMapper mapper;

    public AlunoResposta cadastrarAluno (AlunoRequisicao requisicao) {
        Aluno aluno = 
    }
    

}
