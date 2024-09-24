package com.itsqmet.proyecto.service.servicioImpl;


import com.itsqmet.proyecto.model.Matricula;
import com.itsqmet.proyecto.repository.IMatriculaRepository;
import com.itsqmet.proyecto.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Component
public class MatriculaServiceImpl implements IMatriculaService {

    @Autowired
    private IMatriculaRepository matriculaRepository;

    @Override
    public List<Matricula> mostrarMatriculas() {
        return matriculaRepository.findAll();
    }

    @Override
    public Matricula guardarMatricula(Matricula matricula) {
        return matriculaRepository.save(matricula);
    }

    @Override
    public Matricula obtenerPorId(Integer id) {
        return matriculaRepository.findById(id).get();
    }

    @Override
    public Matricula actualizarMatricula(Matricula matricula) {
        return matriculaRepository.save(matricula);
    }

    @Override
    public void eliminarMatricula(Integer id) {
        matriculaRepository.deleteById(id);
    }
}
