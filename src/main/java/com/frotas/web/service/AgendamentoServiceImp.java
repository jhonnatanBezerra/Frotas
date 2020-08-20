package com.frotas.web.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.frotas.web.domain.Agendamento;
import com.frotas.web.repository.AgendamentoDao;

@Service @Transactional(readOnly = false)
public class AgendamentoServiceImp implements AgendamentoService{

	private AgendamentoDao ad;
	
	@Override
	public void save(Agendamento a) {
		ad.save(a);
	}

	@Override
	public void update(Agendamento a) {
		ad.update(a);
	}

	@Override
	public void delete(Long id) {
		ad.delete(id);
	}

	@Override
	public Agendamento findById(Long id) {
		
		return ad.findById(id);
	}

	@Override
	public List<Agendamento> findAll() {
		
		return ad.findAll();
	}

}
