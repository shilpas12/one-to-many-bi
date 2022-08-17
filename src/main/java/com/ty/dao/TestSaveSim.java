package com.ty.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Mobile;
import com.ty.dto.Sim;

public class TestSaveSim {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Mobile mobile = new Mobile();
		mobile.setName("OnePlus");
		mobile.setCost(720000);

		Sim sim = new Sim();
		sim.setImrc("AIR8758");
		sim.setProvider("AIRTEL");
		sim.setMobile(mobile);

		Sim sim1 = new Sim();
		sim1.setImrc("JIO896");
		sim1.setProvider("JIO");
		sim1.setMobile(mobile);

		entityTransaction.begin();
		entityManager.persist(mobile);
		entityManager.persist(sim);
		entityManager.persist(sim1);
		entityTransaction.commit();

	}

}
