package com.irving.dao;

import java.util.List;

import com.irving.model.City;


public interface CityDAO {

	
	public List< City> findAllByState(int id);
	
}
