package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import util.JPAUtil;

public class PersistidorDeAutomovel {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		Query q = em.createQuery("SELECT a FROM Automovel a ", Automovel.class);
		
		List<Automovel> autos = q.getResultList();
		
		for (Automovel automovel : autos) {
			System.out.println(automovel.getModelo());
		}
	}

}
