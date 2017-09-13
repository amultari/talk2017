package it.prova.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class StudentDAO {
	
	@PersistenceContext(unitName = "defaultPersistenceUnit")
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public  List<it.prova.model.Student> list() {
			return em.getEntityManagerFactory().createEntityManager().createQuery("from Student").getResultList();
	}
}
