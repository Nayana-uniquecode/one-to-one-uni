package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Pan;
import com.ty.onetoone.dto.Person;

public class TestGetPan {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nayana");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Pan pan = entityManager.find(Pan.class, 1);
		Person person = pan.getPerson();
		
		System.out.println("Pan no : "+pan.getPanNumber());
		System.out.println("date : "+ pan.getDate());
		System.out.println("county :"+pan.getCountry());
		
		System.out.println("Person detailes :-");
		System.out.println("name : "+person.getName());
		System.out.println("phone no :" +person.getPhone());
		System.out.println("Gender : "+person.getGender());
	}

}
