package com.biblioteca.biblioteca_backend.service;

import com.biblioteca.biblioteca_backend.model.Tematica;
import com.biblioteca.biblioteca_backend.repository.ITematicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TematicaServiceImp implements ITematicaService{

    @Autowired
    ITematicaRepository tematicaRepository;

    @Override
    public List<Tematica> encontrarTematicas() {
        List<Tematica> tematicas = tematicaRepository.findAll();
        return tematicas;
    }
}
