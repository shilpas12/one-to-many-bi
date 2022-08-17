package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Brand;
import com.ty.dto.Product;

public class TestGetBrand {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();

		Brand brand = entityManager.find(Brand.class, 1);
		System.out.println(brand.getId());
		System.out.println(brand.getName());
		System.out.println(brand.getType());

		List<Product> product = brand.getProducts();
		if (!product.isEmpty()) {
			for (Product pro : product) {
				System.out.println(pro.getId());
				System.out.println(pro.getName());
				System.out.println(pro.getCost());
				System.out.println("------------------------------------");
			}
		}

	}

}
