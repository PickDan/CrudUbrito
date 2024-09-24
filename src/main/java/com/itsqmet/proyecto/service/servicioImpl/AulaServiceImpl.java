package com.itsqmet.proyecto.service.servicioImpl;

import com.itsqmet.proyecto.model.Aula;
import com.itsqmet.proyecto.repository.IAulaRepository;
import com.itsqmet.proyecto.service.IAulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class AulaServiceImpl implements IAulaService {
    @Autowired
    IAulaRepository aulaRepository;
    @Override
    public List<Aula> mostrarAulas() {
        return aulaRepository.findAll();
    }

    @Override
    public Aula guardarAula(Aula aula) {
        return aulaRepository.save(aula);
    }

    @Override
    public Aula obtenerPorId(Integer id) {
        return aulaRepository.findById(id).get();
    }

    @Override
    public Aula actualizarAula(Aula aula) {
        return aulaRepository.save(aula);
    }

    @Override
    public void eliminarAula(Integer id) {
        aulaRepository.deleteById(id);
    }


}
