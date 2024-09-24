package com.itsqmet.proyecto.service.servicioImpl;

import com.itsqmet.proyecto.model.Estudiante;
import com.itsqmet.proyecto.repository.IEstudianteRepository;
import com.itsqmet.proyecto.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class EstudianteServiceImpl implements IEstudianteService {
    @Autowired
    private IEstudianteRepository estudianteRepository;

    @Override
    public List<Estudiante> mostrarEstudiantes() {
        return estudianteRepository.findAll();
    }

    @Override
    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public Estudiante obtenerPorId(Integer id) {
        return estudianteRepository.findById(id).get();
    }

    @Override
    public Estudiante actualizarEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public void eliminarEstudiante(Integer id) {
        estudianteRepository.deleteById(id);
    }


}
