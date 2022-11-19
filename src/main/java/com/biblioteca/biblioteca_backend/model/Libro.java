package com.biblioteca.biblioteca_backend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "libros")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro")
    private long idLibro;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "tematica")
    private String tematica;

    @ManyToOne
    @JoinColumn(name = "id_biblioteca")
    private Biblioteca bibliote;

}
