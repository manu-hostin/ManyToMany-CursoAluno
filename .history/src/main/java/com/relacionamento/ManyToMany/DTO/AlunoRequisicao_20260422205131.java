package com.relacionamento.ManyToMany.DTO;

import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;

import com.relacionamento.ManyToMany.model.Curso;

public record AlunoRequisicao(

    @NotNull
    String nome,

    List<Curso> cursos

) {}
