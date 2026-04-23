package com.relacionamento.ManyToMany.mapper;

import com.relacionamento.ManyToMany.DTO.CursoRequisicao;
import com.relacionamento.ManyToMany.model.Curso;

public class CursoMapper {

    public Curso paraEntidade (CursoRequisicao requisicao) {
        return new Curso(
            requisicao.nome(),
            requisicao.alunos()
        )
    }
    
}
