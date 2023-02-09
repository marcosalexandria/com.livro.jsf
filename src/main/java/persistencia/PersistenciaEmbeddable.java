package persistencia;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import model.Cargo;
import model.Funcionario;
import model.embeddeds.Documentacao;
import model.embeddeds.Endereco;
import util.JPAUtil;

public class PersistenciaEmbeddable {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		

		em.getTransaction().begin();
		Funcionario funcionario = new Funcionario();
		Cargo cargo = new Cargo();
		Documentacao documentacao = new Documentacao();
		Endereco endereco = new Endereco();
		
		cargo.setDescricao("Analista de Sistemas");
		
		documentacao.setCpf("123456789123");
		documentacao.setNacionalidade("Brasileiro");
		documentacao.setNaturalidade("Paraense");
		documentacao.setNomeMae("Maria Rosa");
		documentacao.setNomePai("Pedro Roberto");
		documentacao.setOrgaoExpedidor("USS");
		documentacao.setRg("0123456789");
		documentacao.setSecao(123);
		documentacao.setTituloEleitor("12345678");
		documentacao.setZona(321);
		
		endereco.setCep(2514);
		endereco.setCidade("Belém");
		endereco.setLogradouro("Treze de Junho");
		endereco.setUf("PA");
		
		funcionario.setNome("João");
		funcionario.setNascimento(LocalDate.parse("1999-08-08"));
		funcionario.setDocumentacao(documentacao);
		funcionario.setCargo(cargo);
		funcionario.setEndereco(endereco);
		
		
		
		
		em.persist(cargo);
		em.persist(funcionario);
		em.getTransaction().commit();
		em.close();

	}

}
