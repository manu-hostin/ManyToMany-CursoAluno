package com.relacionamento.ManyToMany.DTO;

import java.util.List;

import com.relacionamento.ManyToMany.model.Aluno;

public record CursoRequisicao(

    String nome,
    
    List<Aluno> alunos

) {} 