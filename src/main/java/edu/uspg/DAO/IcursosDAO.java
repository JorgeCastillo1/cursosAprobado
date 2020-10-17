package edu.uspg.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.uspg.model.cursos;

public interface IcursosDAO extends JpaRepository<cursos, Integer> {

}
