package com.frotas.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.frotas.web.domain.Bairro;
import com.frotas.web.repository.BairroDao;

@Service @Transactional(readOnly = false)
public class BairroServiceImp implements BairroService{
	
	@Autowired
	private BairroDao bd;
	
	@Override
	public void save(Bairro b) {
		bd.save(b);
		
	}

	@Override
	public void update(Bairro b) {
		bd.update(b);
	}

	@Override
	public void delete(Long id) {
		bd.delete(id);
	}

	@Override @Transactional(readOnly = true)
	public Bairro findById(Long id) {
		return bd.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Bairro> findAll() {
		
		return bd.findAll();
	}

	//para regra de negocio
	//caso tiver agendamento para aquele bairro
	//ira retorar um true, então é so tratar no front
	
	@Override
	public boolean temAgendamento(Long id) {
		if(findById(id).getAgendamentos().isEmpty() ) {
			return false;
		}
		return true;
	}

}
