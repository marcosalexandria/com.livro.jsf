package persistencia;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import model.Automovel;
import model.Opcionais;
import util.JPAUtil;

public class PersistenciaManyToMany {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		em.getTransaction().begin();
		
		Opcionais opcionais = new Opcionais();
		opcionais.setDescricao("Arcondicionado");
		
		em.persist(opcionais);
		
		List<Opcionais> listOp = new ArrayList<Opcionais>();
		listOp.add(opcionais);
	
		Automovel automovel = em.find(Automovel.class, 8L);
		automovel.setOpcionais(listOp);
		
		em.persist(automovel);
		
		em.getTransaction().commit();
	}

}
