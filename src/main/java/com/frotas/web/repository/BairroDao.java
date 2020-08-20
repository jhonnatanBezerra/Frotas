package com.frotas.web.repository;

import java.util.List;

import com.frotas.web.domain.Bairro;

public interface BairroDao {
	
	void save (Bairro b);
	
	void update (Bairro b);
	
	void delete (Long b);
	
	Bairro findById(Long id);
	
	List<Bairro> findAll();
	
}
