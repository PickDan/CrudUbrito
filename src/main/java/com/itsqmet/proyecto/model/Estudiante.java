package com.itsqmet.proyecto.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "db.estudiantes")
public class Estudiante implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellido")
    private String apellido;
    @Column(name = "FechaNacimiento")
    private String fecha_nacimiento;
    @Column(name = "Correo", length = 150)
    private String correo;


    @OneToMany(mappedBy = "estudiante") // Corregido
    private List<Matricula> listaMatricula = new ArrayList<>();
}
