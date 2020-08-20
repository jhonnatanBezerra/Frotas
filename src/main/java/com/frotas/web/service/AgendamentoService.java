package com.frotas.web.service;

import java.util.List;

import com.frotas.web.domain.Agendamento;

public interface AgendamentoService {

	void save (Agendamento a);
	
	void update(Agendamento a);
	
	void delete(Long id);
	
	Agendamento findById(Long id);
	
	List<Agendamento> findAll();
	
}
