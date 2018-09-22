package daoImpl;

import java.util.List;
import javax.persistence.TypedQuery;

import org.hibernate.Session;

import dao.CityDAO;
import dao.HibernetSession;
import model.City;

public class CityDAOImpl  implements CityDAO{
	
	private static final String FIND_BY_STATE ="FROM City where Id_State = :stateid";

	public List<City> findAllByState(int id) {
		Session session = HibernetSession.getSession();
		session.beginTransaction();
		TypedQuery<City> query = session.createQuery(FIND_BY_STATE);
		query.setParameter("stateid" ,id);
		List<City>list = query.getResultList();
		session.close();
		return list;
	}
	
	
	
	
	
}
