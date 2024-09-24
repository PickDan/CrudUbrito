package com.itsqmet.proyecto.service;


import com.itsqmet.proyecto.model.Profesor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IProfesorService {

    public List<Profesor> mostrarProfesor();

    public Profesor guardarProfesor(Profesor profesor);

    public Profesor obtenerPorId(Integer id);

    public Profesor actualizarProfesor(Profesor profesor);

    public void eliminarProfesor(Integer id);


}
