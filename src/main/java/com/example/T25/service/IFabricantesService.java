package com.example.T25.service;

import java.util.List;

import com.example.T25.dto.Fabricantes;

public interface IFabricantesService {

	//Metodos del CRUD
	
	public List<Fabricantes> listarFabricantes(); //Listar All 
	
	public Fabricantes crearFabricante(Fabricantes fabricantes);	//CREATE
	
	public Fabricantes leerFabricante(Long id); // READ
		
	public Fabricantes actualizarFabricante(Fabricantes fabricante); // UPDATE
	
	public void borrarFabricante(Long id);// DELETE
	
	
}