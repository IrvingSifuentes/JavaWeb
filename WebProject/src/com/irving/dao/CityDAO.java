package com.irving.dao;

import java.util.List;

import com.irving.model.City;
import com.irving.model.Person;

public interface CityDAO {

	
	public List< City> findAllByState(int id);
	
}
