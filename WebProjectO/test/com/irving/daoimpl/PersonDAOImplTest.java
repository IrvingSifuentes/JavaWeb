package com.irving.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.irving.dao.PersonDAO;
import com.irving.model.Person;


public class PersonDAOImplTest {
	
	PersonDAO persondao = new  PersonDAOImpl();
	Person person = new Person();
	
	
	@Test
	public void insertTest(){
		

		List<Person> personas = new ArrayList<Person>();

		/*
		personas = persondao.getAllPerson();		
		for (Person i : personas){
			System.out.println(i.getId() + " " + i.getName()  );
		}
		*/
		
		/*
		person.setName("Pablo");
		person.setLasName("Castillo");
		person.setEmail("pablo@live.com.mx");
		person.setAge(40);
		person.setAddress("mty");
		person.setState("NL");
		person.setCity("mty");
		person.setPassword("password");
		
		persondao.insert(person);
		*/
		
		
		
	}
	
	
	
	
	
}
