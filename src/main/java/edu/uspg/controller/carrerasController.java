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

import edu.uspg.model.carreras;
import edu.uspg.service.IcarrerasService;


@RestController
@RequestMapping("/carreras")
public class carrerasController {

	@Autowired
	private IcarrerasService service;
	
	@GetMapping
	public List<carreras> listar(){
		return service.listar();
	}
	
	
	@GetMapping(value = "/{id}")
	public carreras listarPorId(@PathVariable("id") Integer id) {
	return service.listarPorId(id);}
	
	@PostMapping
	public carreras registrar(@RequestBody carreras carr) {
		return service.crear(carr);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
}
