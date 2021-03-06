package com.irving.daoimpl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;





import com.irving.dao.HibernateSession;
import com.irving.dao.StateDAO;
import com.irving.model.State;

public class StateDAOImpl implements StateDAO{
	
	private static final String GET_ALL_STATES = "FROM state " ;

	@Override
	public List<State> getAllStates() {
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		TypedQuery<State>query = session.createQuery(GET_ALL_STATES);
		List<State> list = query.getResultList();
		session.close();
		return list;
	}

	@Override
	public State findById(int id) {
		State state = (State)HibernateSession.getObjectByPrimaryKey(State.class, id);
		return state;
	}

}
