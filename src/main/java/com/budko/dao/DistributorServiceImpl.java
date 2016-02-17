package com.budko.dao;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.budko.entities.Distributor;

@Service
public class DistributorServiceImpl implements DistributorService{
	@Inject
	DistributorDao dao;
	
	public DistributorServiceImpl() {}
	
	public List<Distributor> findAll() {
		return dao.findAll();
	}
	
	public Distributor findById(int id) {
		return dao.findById(id);
	}
	
	@Transactional
	public void save(Distributor distributor) {
		dao.save(distributor);
	}
}
