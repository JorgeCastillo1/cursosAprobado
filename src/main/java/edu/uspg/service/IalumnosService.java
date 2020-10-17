package edu.uspg.service;

import java.util.List;

import edu.uspg.model.alumnos;

public interface IalumnosService {
	
	public alumnos crear(alumnos al);
	public alumnos modificar(alumnos al);
	public List<alumnos> listar();
	public alumnos listarPorId(Integer id);
	public void eliminar(Integer id);
	
	
}
