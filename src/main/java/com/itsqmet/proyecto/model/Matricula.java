package com.itsqmet.proyecto.model;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
@Data
@Entity
@Table(name = "db.matriculas")
public class Matricula implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Fecha")
    private String fechaMatricula;

    @ManyToOne
    @JoinColumn(name = "fkMatEstu")
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "fkCurso")
    private Curso curso;
}
