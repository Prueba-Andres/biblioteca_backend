package com.biblioteca.biblioteca_backend.service;

import com.biblioteca.biblioteca_backend.model.Libro;

import java.util.List;
import java.util.Optional;

public interface ILibroService {

    public Libro crearLibro(Libro libro);

    public Optional<Libro> encontrarLibroPorId(long id);

    public List<Libro> encontrarLibros();

    public boolean eliminarLibroPorId(long id);

    public void eliminarLibro(Libro libro);


}
