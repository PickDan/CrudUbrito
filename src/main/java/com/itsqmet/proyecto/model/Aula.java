package com.itsqmet.proyecto.model;

import jakarta.persistence.*;
import lombok.Data;


import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "db.aulas")
public class Aula implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Nombre", length = 50)
    private String nombreAula;
    @Column(name = "Capacidad")
    private int capacidad;

    @OneToMany(mappedBy = "aula")
    private List<Curso> cursos = new ArrayList<>();


}
