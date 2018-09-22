package dao;

import java.util.List;

import model.State;

public interface StateDAO {
	
public List<State>getAllStates();
	
	public State findById(int id);

}
