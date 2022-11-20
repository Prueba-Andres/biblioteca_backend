package com.biblioteca.biblioteca_backend.service;

import com.biblioteca.biblioteca_backend.model.Biblioteca;
import com.biblioteca.biblioteca_backend.repository.IBibliotecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BibliotecaServiceImp implements IBibliotecaService {

    @Autowired
    IBibliotecaRepository bibliotecaRepository;

    @Override
    public Biblioteca crearBiblioteca(Biblioteca biblioteca) {
        Biblioteca crearBiblioteca = bibliotecaRepository.save(biblioteca);
        return crearBiblioteca;
    }

    @Override
    public Optional<Biblioteca> encontrarBibliotecaPorId(long id) {
        Optional<Biblioteca> biblioteca = bibliotecaRepository.findById(id);
        if (biblioteca.isPresent())
            return biblioteca;
        return null;
    }

    @Override
    public List<Biblioteca> encontrarBibliotecas() {
        List<Biblioteca> bibliotecas = bibliotecaRepository.findAll();
        return  bibliotecas;
    }

    @Override
    public boolean eliminiarBiliotecaPorId(long id) {
        try {
            bibliotecaRepository.deleteById(id);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void eliminarBiblioteca(Biblioteca biblioteca) {
        try {
            bibliotecaRepository.delete(biblioteca);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
