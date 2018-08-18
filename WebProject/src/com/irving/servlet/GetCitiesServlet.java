package com.irving.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.irving.model.City;

import util.Dropdowns;

/**
 * Servlet implementation class GetCitiesServlet
 */
@WebServlet("/GetCitiesServlet")
public class GetCitiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetCitiesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		
		String stateId = request.getParameter("stateId");
		Dropdowns drops = new Dropdowns();
		List<City> cities = drops.getCityDrop(Integer.parseInt(stateId));
		//System.out.println(stateId);
		String citiesJson = new Gson().toJson(cities);
		PrintWriter out = response.getWriter();
		out.println(citiesJson);
		
		/*
		for(City city : cities){
			System.out.println(city.getName());
		}
		*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
