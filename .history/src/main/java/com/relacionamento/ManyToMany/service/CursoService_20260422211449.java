package com.relacionamento.ManyToMany.service;

import org.springframework.stereotype.Service;

import com.relacionamento.ManyToMany.mapper.AlunoMapper;
import com.relacionamento.ManyToMany.repository.CursoRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CursoService {
    
    
    private final CursoRepository repository;
    private final AlunoMapper mapper;

}
