package com.budko.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.budko.entities.Distributor;

@Repository
public class DistributorDaoImpl implements DistributorDao{

	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public void save(Distributor distributor) {
		em.persist(distributor);
	}
	
	public List<Distributor> findAll() {
		TypedQuery<Distributor> query = em.createQuery("SELECT d FROM Distributor d",Distributor.class);
		List<Distributor> list = query.getResultList();
		return list;
	}
	public Distributor findById(int id) {
		Distributor distributor = null;
		distributor = em.find(Distributor.class,id);
		return distributor;
	}
	
	public DistributorDaoImpl() {}
}
