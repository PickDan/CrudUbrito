package com.itsqmet.proyecto.service;

import com.itsqmet.proyecto.model.Aula;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface IAulaService {
    public List<Aula> mostrarAulas();

    public Aula guardarAula(Aula aula);

    public Aula obtenerPorId(Integer id);

    public Aula actualizarAula(Aula aula);

    public void eliminarAula(Integer id);
}
