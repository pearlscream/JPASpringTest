package com.budko.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.budko.entities.Beer;

@Repository
public class BeerDaoImpl implements BeerDao{
	
	public BeerDaoImpl() {
		
	}

	@PersistenceContext
    private EntityManager em;
	
	public List<Beer> findAll() {
		TypedQuery<Beer> query = em.createQuery("SELECT b FROM Beer b",Beer.class);
		List<Beer> list = null;
		list = query.getResultList();
		return list;
	}
	
	public Beer findById(int id) {
		Beer m = null;
    	m = em.find(Beer.class, id);
    	return m;
	}
	@Transactional("transactionManager")
	public void save(Beer beer) {
		em.persist(beer);
	}
}
