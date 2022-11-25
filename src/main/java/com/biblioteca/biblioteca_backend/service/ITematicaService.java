package com.biblioteca.biblioteca_backend.service;

import com.biblioteca.biblioteca_backend.model.Libro;
import com.biblioteca.biblioteca_backend.model.Tematica;

import java.util.List;

public interface ITematicaService {

    public List<Tematica> encontrarTematicas();

}
