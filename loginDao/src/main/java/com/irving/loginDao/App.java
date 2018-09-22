package com.irving.loginDao;

import java.util.List;

import dao.PersonDAO;
import daoImpl.PersonDAOImpl;
import model.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        PersonDAO persondao = new PersonDAOImpl();
        List<Person>person = persondao.getAllPerson();
        
        for (Person p : person) {
        	System.out.println( "Nombre: " + p.getName());
        }
        
        
    }
}
