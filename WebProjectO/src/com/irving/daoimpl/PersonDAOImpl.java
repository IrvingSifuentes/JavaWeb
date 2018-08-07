package com.irving.daoimpl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.irving.dao.HibernateSession;

import com.irving.dao.PersonDAO;
import com.irving.model.Person;

public class PersonDAOImpl implements PersonDAO{
	
	private static final String GET_ALL_PERSON = "FROM Person";//HQL(hibernet Query Language)
	private static final String FIND_BY_EMAIL = "FROM Person Where Email = :email " ;	

	@Override
	public void insert(Person person) {
		HibernateSession.saveObject(person);
		
	}

	@Override
	public List<Person> getAllPerson() {
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		TypedQuery<Person> query = session.createQuery(GET_ALL_PERSON);
		List<Person> list = query.getResultList();
		session.close();
		return list;
	}

	@Override
	public Person findById(int id) {
      Person person = (Person)HibernateSession.getObjectByPrimaryKey(Person.class, id);
		
		return person;
	}

	@Override
	public Person findByEmail(String email) {
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		TypedQuery<Person> query = session.createQuery(FIND_BY_EMAIL);
		query.setParameter("email", email);
		session.close();
		Person person = (Person)query.getResultList().get(0);
		
		return person;
	}

	@Override
	public void delete(Person person) {
		HibernateSession.deleteObject(person);
		
	}

	@Override
	public void update(Person person) {
		HibernateSession.updateObject(person);
		
	}

	
	
}
