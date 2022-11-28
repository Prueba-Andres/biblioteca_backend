package com.biblioteca.biblioteca_backend.controller;

import com.biblioteca.biblioteca_backend.model.Libro;
import com.biblioteca.biblioteca_backend.service.LibroServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/libro/")
@CrossOrigin(origins = "http://localhost:4200")
public class LibroRestController {

    @Autowired
    private LibroServiceImp libroServiceImp;

    @PostMapping
    private ResponseEntity<Libro> crearLibro(@RequestBody Libro libro){
        Libro libroCreado = libroServiceImp.crearLibro(libro);
        return new ResponseEntity<>(libroCreado, HttpStatus.OK);
    }

    @GetMapping(path = "{id}")
    private Optional<Libro> encontrarLibroPorId(@PathVariable("id") long id){
        return libroServiceImp.encontrarLibroPorId(id);
    }

    @GetMapping
    private ResponseEntity<List<Libro>> encontrarLibros(){
        return ResponseEntity.ok(libroServiceImp.encontrarLibros());
    }

    @DeleteMapping(path = "{id}")
    private String eliminarLibroPorId(@PathVariable("id") long id){
        boolean eliminado=  libroServiceImp.eliminarLibroPorId(id);

        if(eliminado) return "Cliente eliminado";
        else return "Error eliminando cliente";
    }

    @GetMapping(path = "tematica/{tematica}")
    private List<Libro> encontrarPorTematica(@PathVariable("tematica") String tematica ){
        return this.libroServiceImp.encontrarLibroPorTematica(tematica);
    }






}
