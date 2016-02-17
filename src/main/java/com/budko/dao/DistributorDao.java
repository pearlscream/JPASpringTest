package com.budko.dao;
import java.util.List;

import com.budko.entities.Distributor;

public interface DistributorDao {
	public Distributor findById(int id);
	public List<Distributor> findAll();
	public void save(Distributor distributor);
}
