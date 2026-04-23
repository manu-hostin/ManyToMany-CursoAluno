package com.relacionamento.ManyToMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relacionamento.ManyToMany.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, int>{}
