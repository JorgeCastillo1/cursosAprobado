package edu.uspg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alumnos")
public class alumnos {

	@Id
	private int id;
	@Column(name="nombre", length = 25)
	private String nombre;
	@Column(name="direccion", length = 100)
	private String direccion;
	@Column(name="celular", length = 8)
	private int celular;
	@Column(name="carnet", length = 15)
	private int carnet;
	
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
	public int getCarnet() {
		return carnet;
	}
	public void setCarnet(int carnet) {
		this.carnet = carnet;
	}
	
	
}
