package com.relacionamento.ManyToMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relacionamento.ManyToMany.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer>{

    
} 