package com.budko.dao;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.budko.entities.Beer;


@Service
public class BeerServiceImpl implements BeerService{

	@Inject
	BeerDao dao;
	
	public Beer findById(int id) {
		return dao.findById(id);
	}

	public List<Beer> findAll() {
		return dao.findAll();
	}

	@Transactional("transactionManager")
	public void save(Beer beer) {
		dao.save(beer);
	}

	
}
