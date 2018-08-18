package com.irving.daoimpl;

import java.util.List;

import javax.persistence.TypedQuery;


import org.hibernate.Session;




import com.irving.dao.HibernetSession;
import com.irving.dao.PersonDAO;
import com.irving.model.Person;

public class PersonDAOImpl implements PersonDAO {
	
	private static final String GET_ALL_PERSON = "FROM Person";//HQL(hibernet Query Language)
	private static final String FIND_BY_EMAIL = "FROM Person Where Email = :email " ;	
	

	@Override
	public void insert(Person person) {
		HibernetSession.saveObject(person);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Person> getAllPerson() {
		Session session = HibernetSession.getSession();
		session.beginTransaction();
		TypedQuery<Person> query = session.createQuery(GET_ALL_PERSON);
		List<Person> list = query.getResultList();
		session.close();
		return list;
		
		
	}

	@Override
	public Person findById(int id) {
		// TODO Auto-generated method stub
		Person person = (Person)HibernetSession.getObjectByPrimaryKey(Person.class, id);
		
		return person;
	}

	@Override
	public Person findByEmail(String email) {
		Session session = HibernetSession.getSession();
		session.beginTransaction();
		TypedQuery<Person> query = session.createQuery(FIND_BY_EMAIL);
		query.setParameter("email", email);		
		Person person = (Person)query.getResultList().get(0);
		session.close();
		return person;
	}

	@Override
	public void delete(Person person) {
		HibernetSession.deleteObject(person);
		
	}

	@Override
	public void update(Person person) {
		// TODO Auto-generated method stub
		HibernetSession.updateObject(person);
	}

	
	
	
	
	
}
