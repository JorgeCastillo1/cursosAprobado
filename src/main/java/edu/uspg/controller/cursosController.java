package edu.uspg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.uspg.model.cursos;
import edu.uspg.service.IcursosService;

@RestController
@RequestMapping("/cursos")
public class cursosController {

	@Autowired
	private IcursosService service;
	

	@GetMapping
	public List<cursos> listar(){
		return service.listar();
	}
	
	
	@GetMapping(value = "/{id}")
	public cursos listarPorId(@PathVariable("id") Integer id) {
	return service.listarPorId(id);}
	
	@PostMapping
	public cursos registrar(@RequestBody cursos cur) {
		return service.crear(cur);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
	
}
