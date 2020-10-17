package edu.uspg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="catedraticos")
public class catedraticos {

	@Id
	private int id;
	@Column(name ="nombre", length=25)
	private String nombre;
	@Column(name ="direccion", length=100)
	private String direccion;
	@Column(name ="celular", length=8)
	private int celular;
	@Column(name ="edad", length=4)
	private int edad;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	

}
