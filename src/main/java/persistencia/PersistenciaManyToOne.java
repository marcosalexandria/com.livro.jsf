package persistencia;

import javax.persistence.EntityManager;

import model.Marca;
import model.Modelo;
import util.JPAUtil;

public class PersistenciaManyToOne {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		Marca marca = new Marca();
		Modelo modelo = new Modelo();
		
		em.getTransaction().begin();
		marca.setNome("Fiat");
		modelo.setNome("Mob");
		modelo.setMontadora(marca);
		em.persist(modelo);
		em.getTransaction().commit();
		em.close();
	}

}
