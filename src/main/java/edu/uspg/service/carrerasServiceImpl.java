package edu.uspg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uspg.DAO.IcarrerasDAO;
import edu.uspg.DAO.carrerasDAOImpl;
import edu.uspg.model.carreras;

@Service
public class carrerasServiceImpl implements IcarrerasService {

	@Autowired
	private IcarrerasDAO dao;
	
	@Override
	public carreras crear(carreras carr) {
		return dao.save(carr);
	}

	@Override
	public carreras modificar(carreras carr) {
		return dao.save(carr);
	}

	@Override
	public List<carreras> listar() {
		return dao.findAll();
	}

	@Override
	public carreras listarPorId(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public void eliminar(Integer id) {
		dao.delete(id);
		
	}
}
