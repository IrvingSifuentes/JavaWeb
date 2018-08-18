package com.irving.daoimpl;

import java.util.List;

import org.junit.Test;

import com.irving.dao.PersonDAO;
import com.irving.model.Person;

public class PersonDAOImplTest {
	PersonDAO persondao = new PersonDAOImpl();
	Person person = new Person();
	
  //	@Test
	public void insertTest(){
	
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
	
	//@Test
	public void findByIdTest(){
		
		Person person = persondao.findById(1);
		System.out.println(person);
		
	}
	
	@Test
	public void getAllPerson(){
		PersonDAO person = new PersonDAOImpl();
		List<Person> persons = person.getAllPerson();
		
		for (Person personslist : persons){
			System.out.println(personslist.getId() + " " + personslist.getName() );
		}
		
	}
	
	@Test
    public void deletePerson(){
    	Person person = persondao.findById(1);
    persondao.delete(person);
    }

}
