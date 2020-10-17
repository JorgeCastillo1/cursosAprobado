package edu.uspg.service;

import java.util.List;

import edu.uspg.model.coordinadorAcademico;

public interface IcoordinadorAcademicoService {
	
	public coordinadorAcademico crear(coordinadorAcademico coor);
	public coordinadorAcademico modificar(coordinadorAcademico coor);
	public List<coordinadorAcademico> listar();
	public coordinadorAcademico listarPorId(Integer id);
	public void eliminar(Integer id);
}
