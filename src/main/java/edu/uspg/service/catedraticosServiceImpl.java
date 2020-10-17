package edu.uspg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uspg.DAO.IcatedraticosDAO;
import edu.uspg.DAO.catedraticosDAOImpl;
import edu.uspg.model.catedraticos;

@Service
public class catedraticosServiceImpl implements IcatedraticosService {

	@Autowired
	private IcatedraticosDAO dao;

	@Override
	public catedraticos crear(catedraticos cat) {
		return dao.save(cat);
	}

	@Override
	public catedraticos modificar(catedraticos cat) {
		return dao.save(cat);
	}

	@Override
	public List<catedraticos> listar() {
		return dao.findAll();
	}

	@Override
	public catedraticos listarPorId(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public void eliminar(Integer id) {
		dao.delete(id);
		
	}
	
	
}
