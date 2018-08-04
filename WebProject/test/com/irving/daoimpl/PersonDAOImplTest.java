package com.irving.daoimpl;

import org.junit.Test;

import com.irving.dao.PersonDAO;
import com.irving.model.Person;

public class PersonDAOImplTest {
	
	@Test
	public void insertTest(){
		PersonDAO persondao = new PersonDAOImpl();
		Person person = new Person();
		person.setName("Irving");
		person.setLasName("Sifuentes");
		person.setEmail("irving.sifuentes@live.com.mx");
		person.setAge(29);
		person.setAddress("mty");
		person.setState("NL");
		person.setCity("Apodaca");
		person.setPassword("password");
		
		persondao.insert(person);
		
	}

}
