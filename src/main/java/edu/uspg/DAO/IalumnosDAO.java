package edu.uspg.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.uspg.model.alumnos;

public interface IalumnosDAO extends JpaRepository<alumnos, Integer> {
	
}
