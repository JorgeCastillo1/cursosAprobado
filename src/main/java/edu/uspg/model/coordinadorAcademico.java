package edu.uspg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coordinador")
public class coordinadorAcademico {
	
	@Id
	private int id;
	@Column(name="nombreCoordinador", length = 25)
	private String nombre;
	@Column(name="direccionCoordinador", length = 100)
	private String direccion;
	@Column(name="celularCoordinador", length = 8)
	private int celular;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	
	
	
}
