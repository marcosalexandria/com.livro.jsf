package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Marca;
import model.Modelo;

public class PersistenciaManyToOne {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("livrojsf");
		EntityManager em = emf.createEntityManager();
		Marca marca = new Marca();
		Modelo modelo = new Modelo();
		
		em.getTransaction().begin();
		marca.setNome("Fiat");
		em.persist(marca);
		modelo.setNome("Uno");
		modelo.setMontadora(marca);
		em.persist(modelo);
		em.getTransaction().commit();
		em.close();
	}

}
