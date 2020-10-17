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

import edu.uspg.model.alumnos;
import edu.uspg.service.IalumnosService;


@RestController
@RequestMapping("/alumnos")
public class alumnosController {
	
	@Autowired
	private IalumnosService service;
	
	@GetMapping
	public List<alumnos> listar(){
		return service.listar();
	}
	
	
	@GetMapping(value = "/{id}")
	public alumnos listarPorId(@PathVariable("id") Integer id) {
	return service.listarPorId(id);}
	
	@PostMapping
	public alumnos registrar(@RequestBody alumnos al) {
		return service.crear(al);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
}
