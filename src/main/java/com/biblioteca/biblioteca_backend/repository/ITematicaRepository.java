package com.biblioteca.biblioteca_backend.repository;

import com.biblioteca.biblioteca_backend.model.Tematica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITematicaRepository extends JpaRepository<Tematica, Long> {
}
