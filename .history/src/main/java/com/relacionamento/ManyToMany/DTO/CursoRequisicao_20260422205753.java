package com.relacionamento.ManyToMany.DTO;

public record CursoRequisicao(

    String nome,
    List<Aluno> alunos

) {} 