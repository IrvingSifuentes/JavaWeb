package dao;

import java.util.List;

import model.City;

public interface CityDAO {

	
	public List< City> findAllByState(int id);
}
