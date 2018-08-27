package util;

import java.util.List;

import com.irving.dao.CityDAO;
import com.irving.dao.PersonDAO;
import com.irving.dao.StateDAO;
import com.irving.daoimpl.CityDAOImpl;
import com.irving.daoimpl.PersonDAOImpl;
import com.irving.daoimpl.StateDAOImpl;
import com.irving.model.City;
import com.irving.model.Person;
import com.irving.model.State;

public class Dropdowns {

	private List<State> stateDrop;
	private List<City>  cityDrop;
	private List<Person> personList;
	
	
	public List<State> getStateDrop() {
	 StateDAO statedao = new StateDAOImpl();
	 stateDrop = statedao.getAllStates();
		
		return stateDrop;
	}
	public void setStateDrop(List<State> stateDrop) {
		this.stateDrop = stateDrop;
	}
	
	
	public List<City> getCityDrop(int stateid) {
		CityDAO citydao = new CityDAOImpl();
		cityDrop = citydao.findAllByState(stateid);
		
		return cityDrop;
	}
	
	public void setCityDrop(List<City> cityDrop) {
		this.cityDrop = cityDrop;

	
	
	}
	
	public List<Person> getPersonList() {
	   PersonDAO personDao = new PersonDAOImpl();
	   personList = personDao.getAllPerson();				
		return personList;
	}
	
	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}
	
	
	public List<City> getCityDrop() {
		return cityDrop;
	}
	
	
   	
	
}
