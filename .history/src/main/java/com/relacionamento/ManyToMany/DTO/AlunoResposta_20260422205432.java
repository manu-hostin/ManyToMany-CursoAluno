package com.relacionamento.ManyToMany.DTO;

public record AlunoResposta(

    int id, 
    String nome,
    List<Curso> cursos


) {}