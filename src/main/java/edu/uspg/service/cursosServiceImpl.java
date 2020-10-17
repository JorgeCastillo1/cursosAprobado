package edu.uspg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uspg.DAO.IcursosDAO;
import edu.uspg.DAO.cursosDAOImpl;
import edu.uspg.model.cursos;

@Service
public class cursosServiceImpl implements IcursosService {

	@Autowired
	private IcursosDAO dao;

	@Override
	public cursos crear(cursos cur) {
		return dao.save(cur);
	}

	@Override
	public cursos modificar(cursos cur) {
		return dao.save(cur);
	}

	@Override
	public List<cursos> listar() {
		return dao.findAll();
	}

	@Override
	public cursos listarPorId(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public void eliminar(Integer id) {
		dao.delete(id);
		
	}



}
