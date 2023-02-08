package controller;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;

import model.Automovel;
import util.JPAUtil;

@ManagedBean
public class AutomovelBean {
	
	private Automovel automovel = new Automovel();
	
	public Automovel getAutomovel() {
		return automovel;
	}

	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}


	public void salvar() {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(automovel);
		em.getTransaction().commit();
		em.close();
	}
}
