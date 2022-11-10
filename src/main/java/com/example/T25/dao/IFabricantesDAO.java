package com.example.T25.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.T25.dto.Fabricantes;


public interface IFabricantesDAO extends JpaRepository<Fabricantes, Long>{
	
}
