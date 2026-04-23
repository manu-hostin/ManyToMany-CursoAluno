package com.relacionamento.ManyToMany.mapper;

import com.relacionamento.ManyToMany.DTO.AlunoRequisicao;
import com.relacionamento.ManyToMany.DTO.CursoRequisicao;
import com.relacionamento.ManyToMany.DTO.CursoResposta;
import com.relacionamento.ManyToMany.model.Aluno;
import com.relacionamento.ManyToMany.model.Curso;

public class AlunoMapper {

    public Aluno paraEntidade (AlunoRequisicao requisicao) {
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
