package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Address;
import com.ty.onetoone.dto.Branch;

public class TestGetBranch {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nayana");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Branch branch = entityManager.find(Branch.class, 1);
	    Address address=branch.getAddress();
	    
	    System.out.println("Branch name : " + branch.getName());
	    System.out.println("Branch Phone : " +branch.getPhone());
	    
	    System.out.println("Branch Address :-");
	    
	    System.out.println("Area : " +address.getArea());
	    System.out.println("pin : " +address.getPin());
	    System.out.println("State : " +address.getState());
	}

}
