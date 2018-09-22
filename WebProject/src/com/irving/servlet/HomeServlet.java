package com.irving.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Dropdowns;

import com.google.gson.Gson;
import com.irving.dao.PersonDAO;
import com.irving.daoimpl.PersonDAOImpl;
import com.irving.model.City;
import com.irving.model.Person;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int personId = Integer.parseInt(request.getParameter("Id"));
		String button = request.getParameter("btn");
		System.out.println(personId + " " + button);
		if(button.equals("delete")){
			DeleteButton(personId);
			
		}else if (button.equals("updatemodal")){
			System.out.println("se ejcuta updatemodal");
			UpdateModel(personId,request,response);
		}
			
			else{
			updatebutton (personId,request,response);
		}
	}
	
	public void UpdateModel (int person_id , HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		response.setContentType("application/json");
        PersonDAO persondao = new PersonDAOImpl ();	
        
		Person person = persondao.findById(person_id);
		String personlistJson = new Gson().toJson(person);
		PrintWriter out = response.getWriter();
		out.println(personlistJson);
		//System.out.println(person);
		
	/*
		person =(persondao.findById(person_id));
		
		Dropdowns drops = new Dropdowns();
		//List<Person> person = drops.getPersonList(Integer.parseInt(person_id));
//		List<Person> person = drops.getCityDrop(Integer.parseInt(person_id));
		//System.out.println(stateId);
		String citiesJson = new Gson().toJson(person);
		PrintWriter out = response.getWriter();
		out.println(citiesJson);
		
		*/
		
	}

	public void DeleteButton(int personid){
		Person person = new Person();
		PersonDAO persondao = new PersonDAOImpl();
		person =(persondao.findById(personid));		
		persondao.delete(person);
		;
		
	}
	
	public void updatebutton(int personid ,HttpServletRequest request , HttpServletResponse response){
		
		PersonDAO persondao = new PersonDAOImpl ();
		
		Person person = persondao.findById(personid);
		
		person.setName(request.getParameter("name_id"));
		person.setLasName(request.getParameter("lastname_id"));
		person.setEmail(request.getParameter("email_id"));
		person.setAge(Integer.parseInt(request.getParameter("age_id")));
		person.setAddress(request.getParameter("address_id"));
		person.setState(request.getParameter("state_id"));
		person.setCity(request.getParameter("city_id"));
		person.setPassword(request.getParameter("pasword_id"));
		
		persondao.update(person);
		
		
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		
	}

	public void deletePerson(){
		
	}
	
}
