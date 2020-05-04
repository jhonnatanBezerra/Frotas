package com.frotas.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.frotas.web.dao.VeiculoDao;
import com.frotas.web.domain.Veiculo;

@Service @Transactional(readOnly = false)
public class VeiculoServiceImp implements VeiculoService{
	
	@Autowired
	private VeiculoDao dao;
	
	@Override
	public void save(Veiculo veiculo) {
		dao.save(veiculo);
	}

	@Override
	public void update(Veiculo veiculo) {
		dao.update(veiculo);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override @Transactional(readOnly = true)
	public Veiculo findById(Long id) {
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Veiculo> findAll() {
		return dao.findAll();
	}

}
