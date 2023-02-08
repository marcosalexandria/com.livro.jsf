package repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Automovel;
import util.JPAUtil;

public class AutomovelRepository {
	public void salvar(Automovel automovel) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(automovel);
		em.getTransaction().commit();
	}
	
	public List<Automovel> todos(){
		EntityManager em = JPAUtil.getEntityManager();
		Query q = em.createQuery("SELECT a FROM Automovel a", Automovel.class);
		return q.getResultList();
	}
}
