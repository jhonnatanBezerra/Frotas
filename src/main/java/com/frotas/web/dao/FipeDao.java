package com.frotas.web.dao;

import java.util.List;


import com.frotas.web.domain.Fipe;


public interface FipeDao {
	
	void save(Fipe f);

	void update(Fipe f);

	void delete(Long id);

	Fipe findById(Long id);

	List<Fipe> findAll();
}
