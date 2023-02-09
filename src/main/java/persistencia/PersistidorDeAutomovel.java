package persistencia;

import javax.persistence.EntityManager;

import model.Automovel;
import util.JPAUtil;

public class PersistidorDeAutomovel {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		Automovel auto = em.getReference(Automovel.class, 1L);
		em.remove(auto);
		em.getTransaction().commit();
	}

}
