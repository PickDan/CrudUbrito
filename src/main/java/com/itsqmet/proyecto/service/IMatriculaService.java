package com.itsqmet.proyecto.service;

import com.itsqmet.proyecto.model.Matricula;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IMatriculaService {

    public List<Matricula> mostrarMatriculas();

    public Matricula guardarMatricula(Matricula matricula);

    public Matricula obtenerPorId(Integer id);

    public Matricula actualizarMatricula(Matricula matricula);

    public void eliminarMatricula(Integer id);
}
