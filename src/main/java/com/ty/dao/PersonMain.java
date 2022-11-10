package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.AadharCard;
import com.ty.dto.Person;

public class PersonMain {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person person = new Person();
		person.setName("Rajan");
		person.setAge(30);
		person.setAddress("BTM");

		AadharCard card = new AadharCard();
		card.setName("Rajan");
		card.setAddress("BTM");
		card.setAadharno(253367566);

		person.setCard(card);
		card.setPerson(person);

		entityTransaction.begin();
		entityManager.persist(card);
		entityManager.persist(person);
		entityTransaction.commit();

	}

}
