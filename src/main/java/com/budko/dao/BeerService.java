package com.budko.dao;

import java.util.List;

import com.budko.entities.Beer;


public interface BeerService {
	public Beer findById(int id);
	public List<Beer> findAll();
	public void save(Beer beer);
}
