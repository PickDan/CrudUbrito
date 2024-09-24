package com.itsqmet.proyecto.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "db.profesores")
public class Profesor implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellido")
    private String apellido;
    @Column(name = "Correo", length = 100)
    private String correo;
    @Column(name = "Especialización")
    private String especializacion;

    @OneToMany(mappedBy = "fkImparte")
    private List<Curso> cursos = new ArrayList<>();
}
