package com.irving.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Operaciones
 */
@WebServlet("/Operaciones")
public class Operaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Operaciones() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    int numeroUnoI ;
    int numeroDosI ;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String numeroUno = request.getParameter("numerouno");
		String numeroDos = request.getParameter("numerodos");
		
		 numeroUnoI = Integer.parseInt(numeroUno);
		 numeroDosI = Integer.parseInt(numeroDos);
		

		out.println("<h3>Reading QueryString data using 'String getParameter(String name)' method: </h3>");
		out.println("<div>");
		out.println("<p>Numero Uno : " + numeroUno + "</p>");
		out.println("<p>Numero Dos : " + numeroDos + "</p>");
		
		out.println("<p>La suma es  : " + suma(numeroUnoI, numeroDosI) + "</p>");
		out.println("</div>");
		
		
		
		
		
		
		
		
		
	}
	
	public int suma (int numeroUnoI , int numeroDosI){
		
		return numeroUnoI + numeroDosI ;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
