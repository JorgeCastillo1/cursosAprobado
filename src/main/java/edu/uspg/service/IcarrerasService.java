package edu.uspg.service;

import java.util.List;

import edu.uspg.model.carreras;

public interface IcarrerasService {
	public carreras crear(carreras carr);
	public carreras modificar(carreras carr);
	public List<carreras> listar();
	public carreras listarPorId(Integer id);
	public void eliminar(Integer id);
}
