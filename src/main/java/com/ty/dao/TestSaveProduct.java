package com.ty.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Brand;
import com.ty.dto.Product;

public class TestSaveProduct {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Brand brand = new Brand();
		brand.setName("IOS");
		brand.setType("ELECTRONICS");

		Product product = new Product();
		product.setName("iwatch");
		product.setCost(45000);
		product.setBrand(brand);

		Product product1 = new Product();
		product1.setName("iphone");
		product1.setCost(145000);
		product1.setBrand(brand);

		Product product2 = new Product();
		product2.setName("mac");
		product2.setCost(350000);
		product2.setBrand(brand);

		entityTransaction.begin();
		entityManager.persist(brand);
		entityManager.persist(product);
		entityManager.persist(product1);
		entityManager.persist(product2);
		entityTransaction.commit();
		System.out.println("----------DATA SAVED----------");

	}

}
