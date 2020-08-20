package com.frotas.web.repository;

import java.util.List;


import com.frotas.web.domain.Veiculo;

public interface VeiculoDao {
	
	void save(Veiculo v);
	
	void update(Veiculo v);

	void delete(Long id);

	Veiculo findById(Long id);

	List<Veiculo> findAll();
	
	
}
