package com.example.T25.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.T25.dto.Articulos;


public interface IArticulosDAO extends JpaRepository<Articulos, Long>{
	;
	
}
