package com.budko.main;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManagerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.budko.dao.BeerService;
import com.budko.dao.BeerServiceImpl;
import com.budko.dao.DistributorService;
import com.budko.entities.Beer;
import com.budko.entities.Distributor;




public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
		BeerService beerService = context.getBean(BeerService.class);
		DistributorService distributorService = context.getBean(DistributorService.class);
		List<Beer> beer = beerService.findAll();
		for (Beer beer1 : beer) {
			System.out.println(beer1.getBeer());
		}
		
		Beer beer1 = beerService.findById(1);
		beer1.setBeer("new beer");
	}
}
