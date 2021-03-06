package com.irving.dao;

import java.util.List;

import com.irving.model.Person;

public interface PersonDAO {
	
public void insert(Person person);
	
	public List<Person>getAllPerson();
	
	public Person findById (int id);
	
	public Person findByEmail (String email);
	
	public void delete (Person person);
	
	public void update (Person person);

}
