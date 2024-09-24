package com.itsqmet.proyecto.repository;

import com.itsqmet.proyecto.model.Aula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAulaRepository extends JpaRepository<Aula, Integer> {
}
