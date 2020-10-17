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

import edu.uspg.model.catedraticos;
import edu.uspg.service.IcatedraticosService;


@RestController
@RequestMapping("7catedraticos")
public class catedraticosController {
	
	@Autowired
	private IcatedraticosService service;
	
	@GetMapping
	public List<catedraticos> listar(){
		return service.listar();
	}
	
	
	@GetMapping(value = "/{id}")
	public catedraticos listarPorId(@PathVariable("id") Integer id) {
	return service.listarPorId(id);}
	
	@PostMapping
	public catedraticos registrar(@RequestBody catedraticos cat) {
		return service.crear(cat);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
	

}
