package com.relacionamento.ManyToMany.DTO;

import java.util.List;

import com.relacionamento.ManyToMany.model.Curso;

public record AlunoRequisicao(

    String nome,

    List<Curso> cursos

) {}
