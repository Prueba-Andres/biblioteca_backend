package com.biblioteca.biblioteca_backend.service;

import com.biblioteca.biblioteca_backend.model.Biblioteca;
import com.biblioteca.biblioteca_backend.model.Libro;
import com.biblioteca.biblioteca_backend.repository.IBibliotecaRepository;
import com.biblioteca.biblioteca_backend.repository.ILibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LibroServiceImp implements ILibroService {

    @Autowired
    private ILibroRepository libroRepository;
    @Override
    public Libro crearLibro(Libro libro) {
        //se creo para enviar la biblioteca
        Biblioteca biblioteca = new Biblioteca(1, "Departamental");
        libro.setBiblioteca(biblioteca);
        //

        Libro crearLibro = libroRepository.save(libro);
        return crearLibro;
    }

    @Override
    public Optional<Libro> encontrarLibroPorId(long id) {
        Optional<Libro> libro = libroRepository.findById(id);
        if (libro.isPresent())
            return libro;
        return null;
    }

    @Override
    public List<Libro> encontrarLibros() {
        List<Libro> libros = libroRepository.findAll();
        return libros;
    }

    @Override
    public boolean eliminarLibroPorId(long id) {
        try {
            libroRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void eliminarLibro(Libro libro) {
        try {
            libroRepository.delete(libro);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Libro> encontrarLibroPorTematica(String tematica) {
        List<Libro>librostematica = libroRepository.findByTematica(tematica);
        return librostematica;
    }
}