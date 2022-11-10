package com.example.T25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.T25.dao.IFabricantesDAO;
import com.example.T25.dto.Fabricantes;

@Service
public class FabricantesServiceImpl implements IFabricantesService{
	
	//Utilizamos los metodos de la interface IFabricanteDAO, es como si instanciaramos.
	@Autowired
	IFabricantesDAO iFabricanteDAO;
	
	@Override
	public List<Fabricantes> listarFabricantes() {
		return iFabricanteDAO.findAll();
	}
	
	@Override
	public Fabricantes crearFabricante(Fabricantes fabricante) {
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public Fabricantes leerFabricante(Long id) {
		return iFabricanteDAO.findById(id).get();
	}


	@Override
	public Fabricantes actualizarFabricante(Fabricantes fabricante) {
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public void borrarFabricante(Long id) {
		iFabricanteDAO.deleteById(id);
	}

}
