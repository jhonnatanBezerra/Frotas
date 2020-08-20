package com.frotas.web.repository;

import java.util.List;

import com.frotas.web.domain.Categoria;

public interface CategoriaDao {

	void save(Categoria c);

	void update(Categoria c);

	void delete(Long id);

	Categoria findById(Long id);

	List<Categoria> findAll();

}
