package com.relacionamento.ManyToMany.mapper;

import com.relacionamento.ManyToMany.DTO.AlunoRequisicao;
import com.relacionamento.ManyToMany.DTO.AlunoResposta;
import com.relacionamento.ManyToMany.model.Aluno;


public class AlunoMapper {

    public Aluno paraEntidade (AlunoRequisicao requisicao) {
        return new Aluno(
            requisicao.nome(),
            requisicao.cursos()
        );
    }

    public AlunoResposta paraResposta (Aluno aluno) {
        return new AlunoResposta(
            aluno.getId(),
            aluno.getNome(),
            aluno.getCursos()
        );
    }
}
