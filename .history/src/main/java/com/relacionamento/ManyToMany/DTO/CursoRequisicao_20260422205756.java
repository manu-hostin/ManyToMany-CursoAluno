package com.relacionamento.ManyToMany.DTO;

import java.util.List;

public record CursoRequisicao(

    String nome,
    List<Aluno> alunos

) {} 