package com.itsqmet.proyecto.repository;

import com.itsqmet.proyecto.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudianteRepository extends JpaRepository<Estudiante, Integer> {
}
