package com.ty.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Mobile;
import com.ty.dto.Sim;

public class TestGetMobile {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();

		Mobile mobile = entityManager.find(Mobile.class, 1);
		System.out.println("Mobile id: " + mobile.getId());
		System.out.println("Mobile name: " + mobile.getName());
		System.out.println("Mobile cost: " + mobile.getCost());

		List<Sim> sim = mobile.getSim();
		if (!sim.isEmpty()) {
			for (Sim s : sim) {
				System.out.println("---------------------------");
				System.out.println(s.getId());
				System.out.println(s.getImrc());
				System.out.println(s.getProvider());
				System.out.println("-----------------------------");
			}
		}

	}

}
