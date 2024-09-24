package com.itsqmet.proyecto.service;

import com.itsqmet.proyecto.model.Curso;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ICursoService {

    public List<Curso> mostrarCursos();

    public Curso guardarCurso(Curso curso);

    public Curso obtenerPorId(Integer id);

    public Curso actualizarCurso(Curso curso);

    public void eliminarCurso(Integer id);
}
