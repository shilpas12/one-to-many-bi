package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Brand;
import com.ty.dto.Product;

public class TestGetProduct {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();

		Product product = entityManager.find(Product.class, 1);
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getCost());

		Brand brand = product.getBrand();

		if (brand != null) {
			System.out.println("-----------------------------");
			System.out.println(brand.getId());
			System.out.println(brand.getName());
			System.out.println(brand.getType());
			System.out.println("-----------------------------");
		}

	}

}
