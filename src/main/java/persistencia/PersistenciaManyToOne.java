package persistencia;

import java.util.List;

import javax.persistence.EntityManager;

import model.Marca;
import model.Modelo;
import util.JPAUtil;

public class PersistenciaManyToOne {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		
		em.getTransaction().begin();
		
		Marca m = em.find(Marca.class, 1L);
		List<Modelo> modelos = m.getModelos();
		//só busca a lista quando ela é usada
		Modelo modelo = modelos.get(0);
		em.getTransaction().commit();
	}

}
