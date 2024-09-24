package com.itsqmet.proyecto.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "db.curso")
public class Curso implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "NombreCurso", length = 70)
    private String cursoNombre;
    @Column(name = "Descripcion", length = 500)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "fkAula") // Corregido
    private Aula aula; // Corregido

    @OneToMany(mappedBy = "curso") // Corregido
    private List<Matricula> matriculas = new ArrayList<>();

    @ManyToOne // Corregido a ManyToOne
    @JoinColumn(name = "fkProfesorI")
    private Profesor fkImparte;
}
