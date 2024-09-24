package com.itsqmet.proyecto.service.servicioImpl;

import com.itsqmet.proyecto.model.Curso;
import com.itsqmet.proyecto.repository.ICursoRepository;
import com.itsqmet.proyecto.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Component
public class CursoServiceImpl implements ICursoService {


    @Autowired
    private ICursoRepository cursoRepository;
    @Override
    public List<Curso> mostrarCursos() {
        return cursoRepository.findAll();
    }

    @Override
    public Curso guardarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public Curso obtenerPorId(Integer id) {
        return cursoRepository.findById(id).get();
    }

    @Override
    public Curso actualizarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public void eliminarCurso(Integer id) {
        cursoRepository.deleteById(id);
    }
}
