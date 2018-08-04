package com.irving.dao;

import java.util.List;

import com.irving.model.State;

  public interface StateDAO {

	public List<State>getAllStates();
	
	public State findById(int id);
	
	
}
