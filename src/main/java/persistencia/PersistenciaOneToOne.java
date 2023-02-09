package persistencia;

import javax.persistence.EntityManager;

import model.DetalheMarca;
import model.Marca;
import util.JPAUtil;

public class PersistenciaOneToOne {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		Marca marca = new Marca();
		DetalheMarca detalheMarca = new DetalheMarca();
		
		detalheMarca.setAnoFundacao(2010);
		detalheMarca.setFundador("Fiat");
		detalheMarca.setPaisOrigem("Brasil");
		
		marca.setNome("Fiat");
		marca.setDetalheMarca(detalheMarca);
		
		em.getTransaction().begin();
		em.persist(marca);
		em.getTransaction().commit();
		em.close();
	}
}