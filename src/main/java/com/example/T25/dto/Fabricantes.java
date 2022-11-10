package com.example.T25.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="fabricantes")

public class Fabricantes {

	//Atributos de la entidad Empleado
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	
	@OneToMany
	@JoinColumn(name="fabricante_id")
	private List<Fabricantes> fabricante_id;
	
	//Constructores
	
	public Fabricantes() {
		
	}
	
	public Fabricantes(Long id, String nombre, String trabajo, int salario) {
		this.id=id;
		this.nombre=nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Fabricantes")
	public List<Fabricantes> getFabricantes_id() {
		return fabricante_id;
	}

	public void setFabricantes_id(List<Fabricantes> fabricante_id) {
		this.fabricante_id = fabricante_id;
	}

	//To string personalizado
	@Override
	public String toString() {
		return "Empleado [id = " + id +", nombre = " + nombre +" ] ";
	}
}
