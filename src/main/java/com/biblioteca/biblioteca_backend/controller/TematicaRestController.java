package com.biblioteca.biblioteca_backend.controller;

import com.biblioteca.biblioteca_backend.model.Tematica;
import com.biblioteca.biblioteca_backend.service.TematicaServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tematica/")
@CrossOrigin(origins = "http://localhost:4200")
public class TematicaRestController {

    @Autowired
    private TematicaServiceImp tematicaServiceImp;

    @GetMapping
    private ResponseEntity<List<Tematica>> encontrarTematicas(){
        return ResponseEntity.ok(tematicaServiceImp.encontrarTematicas());
    }


}
