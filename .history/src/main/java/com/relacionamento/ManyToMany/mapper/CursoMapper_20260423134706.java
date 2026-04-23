package com.relacionamento.ManyToMany.mapper;

import com.relacionamento.ManyToMany.DTO.CursoRequisicao;
import com.relacionamento.ManyToMany.DTO.CursoResposta;
import com.relacionamento.ManyToMany.model.Curso;

@Component
public class CursoMapper {

    public Curso paraEntidade (CursoRequisicao requisicao) {
        return new Curso(
            requisicao.nome(),
            requisicao.alunos()
        );
    }

    public CursoResposta paraResposta (Curso curso) {
        return new CursoResposta(
            curso.getId(),
            curso.getNome(),
            curso.getAlunos()
        );
    }
    
}
