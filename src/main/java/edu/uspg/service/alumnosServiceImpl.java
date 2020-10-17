package edu.uspg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uspg.DAO.IalumnosDAO;
import edu.uspg.DAO.alumnosDAOImpl;
import edu.uspg.model.alumnos;

@Service
public class alumnosServiceImpl implements IalumnosService {

	@Autowired
	private IalumnosDAO dao;

	@Override
	public alumnos crear(alumnos al) {
		return dao.save(al);
	}

	@Override
	public alumnos modificar(alumnos al) {
		return dao.save(al);
	}

	@Override
	public List<alumnos> listar() {
		return dao.findAll();
	}

	@Override
	public alumnos listarPorId(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public void eliminar(Integer id) {
		dao.delete(id);
		
	}
	
	
}
