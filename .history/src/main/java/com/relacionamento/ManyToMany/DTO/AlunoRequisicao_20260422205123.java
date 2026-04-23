package com.relacionamento.ManyToMany.DTO;

public record AlunoRequisicao(

    @NotNull
    String nome,

    List<Curso> cursos

) {}
