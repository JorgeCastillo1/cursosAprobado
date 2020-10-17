package edu.uspg.service;

import java.util.List;

import edu.uspg.model.catedraticos;

public interface IcatedraticosService {
	public catedraticos crear(catedraticos cat);
	public catedraticos modificar(catedraticos cat);
	public List<catedraticos> listar();
	public catedraticos listarPorId(Integer id);
	public void eliminar(Integer id);
}
