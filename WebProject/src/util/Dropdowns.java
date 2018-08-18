package util;

import java.util.List;

import com.irving.dao.CityDAO;
import com.irving.dao.StateDAO;
import com.irving.daoimpl.CityDAOImpl;
import com.irving.daoimpl.StateDAOImpl;
import com.irving.model.City;
import com.irving.model.State;

public class Dropdowns {

	private List<State> stateDrop;
	private List<City>  cityDrop;
	
	
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
	
	
	
	
}
