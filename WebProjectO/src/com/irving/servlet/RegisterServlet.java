package com.irving.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.irving.dao.PersonDAO;
import com.irving.daoimpl.PersonDAOImpl;
import com.irving.model.Person;



/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		int age =Integer.parseInt(request.getParameter("age")) ;
		String address = request.getParameter("address");
		String password = request.getParameter("password");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String confirmpassword = request.getParameter("confirm-password");
		System.out.println(city + " " + state);
		
	
		if (password.equals(confirmpassword)){
	    PersonDAO persondao = new PersonDAOImpl();
		Person person = new Person();
		person.setName(name);
		person.setLasName(lastname);
		person.setEmail(email);
		person.setAge(age);
		person.setAddress(address);
		person.setCity(city);
		person.setState(state);
        person.setPassword(password);  
        
        persondao.insert(person);
        
		
        
        System.out.println(person);
		}else{
			System.out.println("las contraseņas no son iguales");
		}
		response.sendRedirect("/WebProjectO/index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
