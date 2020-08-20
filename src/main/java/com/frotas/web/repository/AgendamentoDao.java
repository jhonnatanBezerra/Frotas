package com.frotas.web.repository;

import java.util.List;

import com.frotas.web.domain.Agendamento;

public interface AgendamentoDao {

	void save (Agendamento a);
	
	void update(Agendamento a);
	
	void delete(Long id);
	
	Agendamento findById(Long id);
	
	List<Agendamento> findAll();
	
}
