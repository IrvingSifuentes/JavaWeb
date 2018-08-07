package com.irving.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.irving.dao.PersonDAO;
import com.irving.model.Person;


public class PersonDAOImplTest {
	@Test
	public void insertTest(){
		
		PersonDAO persondao = new  PersonDAOImpl();
		Person person = new Person();
		List<Person> personas = new ArrayList<Person>();

		personas = persondao.getAllPerson();
		
		for (Person i : personas){
			System.out.println(i.getId() + " " + i.getName()  );
		}
		
		
		
	}
	
	
	
}
