package com.biblioteca.biblioteca_backend.repository;

import com.biblioteca.biblioteca_backend.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ILibroRepository extends JpaRepository<Libro, Long> {
    List<Libro> findByTematica(String tematica);
}
