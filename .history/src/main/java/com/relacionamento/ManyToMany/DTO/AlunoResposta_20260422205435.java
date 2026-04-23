package com.relacionamento.ManyToMany.DTO;

import java.util.List;

public record AlunoResposta(

    int id, 
    String nome,
    List<Curso> cursos


) {}