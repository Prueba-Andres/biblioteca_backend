package com.biblioteca.biblioteca_backend.repository;

import com.biblioteca.biblioteca_backend.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILibroRepository extends JpaRepository<Libro, Long> {

}
