package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Address;
import com.ty.onetoone.dto.Branch;

public class TestBranch {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("nayana");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Branch branch = new Branch();

		branch.setName("JSPIDER");
		branch.setPhone(3690);

		Address address = new Address();

		address.setArea("BTM");
		address.setPin(23465);
		address.setState("Karnataka");

		branch.setAddress(address);// it helps to map the relationship//

		entityTransaction.begin();
		entityManager.persist(address);// if you set only address address will be stored
		entityManager.persist(branch);// if you set only branch without setting the address ,address will be
										// null,others
		// will be inserted.//if you set address without persist(address) we get
		// exception ,first save then do
		entityTransaction.commit();

	}

}
