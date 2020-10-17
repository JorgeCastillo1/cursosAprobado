package edu.uspg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uspg.DAO.IcoordinadorAcademicoDAO;
import edu.uspg.DAO.coordinadorAcademicoDAOImpl;
import edu.uspg.model.coordinadorAcademico;

@Service
public class coordinadorAcademicoServiceImpl implements IcoordinadorAcademicoService {
	
	@Autowired
	private IcoordinadorAcademicoDAO dao;

	@Override
	public coordinadorAcademico crear(coordinadorAcademico coor) {
		return dao.save(coor);
	}

	@Override
	public coordinadorAcademico modificar(coordinadorAcademico coor) {
		return dao.save(coor);
	}

	@Override
	public List<coordinadorAcademico> listar() {
		return dao.findAll();
	}

	@Override
	public coordinadorAcademico listarPorId(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public void eliminar(Integer id) {
		dao.delete(id);
		
	}
	

}
