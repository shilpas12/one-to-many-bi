package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Mobile;
import com.ty.dto.Sim;

public class TestGetSim {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		
		Sim sim=entityManager.find(Sim.class, 2);
		System.out.println(sim.getId());
		System.out.println(sim.getImrc());
		System.out.println(sim.getProvider());
		
		Mobile mobile=sim.getMobile();
		if(mobile!=null) {
			System.out.println("------------------------------");
			System.out.println(mobile.getId());
			System.out.println(mobile.getName());
			System.out.println(mobile.getCost());
			System.out.println("------------------------------");
		}
	}

}
