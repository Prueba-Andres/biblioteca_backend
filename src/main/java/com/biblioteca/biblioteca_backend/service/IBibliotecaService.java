package com.biblioteca.biblioteca_backend.service;

import com.biblioteca.biblioteca_backend.model.Biblioteca;

import java.util.List;
import java.util.Optional;

public interface IBibliotecaService {

  public Biblioteca crearBiblioteca (Biblioteca biblioteca);

  public Optional<Biblioteca> encontrarBibliotecaPorId(long id);

  public List<Biblioteca> encontrarBibliotecas ();

  public boolean eliminiarBiliotecaPorId (long id);

  public void eliminarBiblioteca(Biblioteca biblioteca);

}
