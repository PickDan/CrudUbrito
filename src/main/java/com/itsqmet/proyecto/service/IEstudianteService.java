package com.itsqmet.proyecto.service;

import com.itsqmet.proyecto.model.Estudiante;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IEstudianteService {

    public List<Estudiante> mostrarEstudiantes();

    public Estudiante guardarEstudiante(Estudiante estudiante);

    public Estudiante obtenerPorId(Integer id);

    public Estudiante actualizarEstudiante(Estudiante estudiante);

    public void eliminarEstudiante(Integer id);
}
