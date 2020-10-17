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
import edu.uspg.model.coordinadorAcademico;
import edu.uspg.service.IcoordinadorAcademicoService;

@RestController
@RequestMapping("/coordinador")
public class coordinadorAcademicoController {
	
	@Autowired
	private IcoordinadorAcademicoService service;
	
	@GetMapping
	public List<coordinadorAcademico> listar(){
		return service.listar();
	}
	
	
	@GetMapping(value = "/{id}")
	public coordinadorAcademico listarPorId(@PathVariable("id") Integer id) {
	return service.listarPorId(id);}
	
	@PostMapping
	public coordinadorAcademico registrar(@RequestBody coordinadorAcademico coor) {
		return service.crear(coor);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
}
