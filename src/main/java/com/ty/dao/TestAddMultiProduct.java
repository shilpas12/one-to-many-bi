package com.ty.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Brand;
import com.ty.dto.Product;

public class TestAddMultiProduct {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Brand brand = entityManager.find(Brand.class, 1);
		System.out.println(brand.getId());
		System.out.println(brand.getName());
		System.out.println(brand.getType());

		List<Product> listPro = new ArrayList<Product>();
		Product pro = new Product();
		pro.setName("Vivo");
		pro.setCost(25000);
		listPro.add(pro);
		pro.setBrand(brand);

		Product pro1 = new Product();
		pro1.setName("vivo hearphone");
		pro1.setCost(56000);
		listPro.add(pro1);
		pro1.setBrand(brand);

		brand.setProducts(listPro);

		entityTransaction.begin();
		entityManager.persist(pro);
		entityManager.persist(pro1);
		entityTransaction.commit();

		System.out.println("--------data saved-----------");

	}

}
