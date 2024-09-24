package com.itsqmet.proyecto.repository;

import com.itsqmet.proyecto.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProfesorRepository extends JpaRepository<Profesor, Integer> {
}
