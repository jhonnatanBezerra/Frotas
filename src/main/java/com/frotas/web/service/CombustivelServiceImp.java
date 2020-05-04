package com.frotas.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.frotas.web.dao.CombustivelDao;
import com.frotas.web.domain.Combustivel;

@Service @Transactional(readOnly = false)
public class CombustivelServiceImp implements CombustivelService{
	
	@Autowired
	private CombustivelDao dao;

	@Override
	public void save(Combustivel combustivel) {
		dao.save(combustivel);
	}

	@Override
	public void update(Combustivel combustivel) {
		dao.update(combustivel);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override @Transactional(readOnly = true)
	public Combustivel findById(Long id) {
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Combustivel> findAll() {
		return dao.findAll();
	}
	
	
}
