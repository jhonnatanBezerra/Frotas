package com.frotas.web.service;

import java.util.List;

import com.frotas.web.domain.Bairro;

public interface BairroService {
	
void save (Bairro b);
	
	void update (Bairro b);
	
	void delete (Long id);
	
	Bairro findById(Long id);
	
	List<Bairro> findAll();
	
	boolean temAgendamento(Long id);
}
