package com.relacionamento.ManyToMany.DTO;

import java.util.List;

public record AlunoRequisicao(

    @NotNull
    String nome,

    List<Curso> cursos

) {}
