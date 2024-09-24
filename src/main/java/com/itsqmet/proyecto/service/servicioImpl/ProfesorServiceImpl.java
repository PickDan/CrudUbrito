package com.itsqmet.proyecto.service.servicioImpl;

import com.itsqmet.proyecto.model.Profesor;
import com.itsqmet.proyecto.repository.IProfesorRepository;
import com.itsqmet.proyecto.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class ProfesorServiceImpl implements IProfesorService {
    @Autowired
    private IProfesorRepository profesorRepository;

    @Override
    public List<Profesor> mostrarProfesor() {
        return profesorRepository.findAll();
    }

    @Override
    public Profesor guardarProfesor(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    @Override
    public Profesor obtenerPorId(Integer id) {
        return profesorRepository.findById(id).get();
    }

    @Override
    public Profesor actualizarProfesor(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    @Override
    public void eliminarProfesor(Integer id) {
        profesorRepository.deleteById(id);
    }
}
