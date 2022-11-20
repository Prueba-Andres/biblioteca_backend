package com.biblioteca.biblioteca_backend.repository;

import com.biblioteca.biblioteca_backend.model.Biblioteca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBibliotecaRepository extends JpaRepository<Biblioteca, Long> {


}
