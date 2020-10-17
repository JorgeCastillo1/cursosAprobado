package edu.uspg.service;

import java.util.List;
import edu.uspg.model.cursos;

public interface IcursosService {
	public cursos crear(cursos cur);
	public cursos modificar(cursos cur);
	public List<cursos> listar();
	public cursos listarPorId(Integer id);
	public void eliminar(Integer id);
}
