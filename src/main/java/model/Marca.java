package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Marca {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	//cascade = CascadeType.ALL Com isso, qualquer opera��o, como por exemplo persist, remove, merge que fizermos na Marca ser� feito tamb�m no DetalheMarca; por isso n�o precisamos chamar o persist nos dois lados.
	@OneToOne(cascade = CascadeType.ALL)
	private DetalheMarca detalheMarca;
	
	@OneToMany(mappedBy = "montadora")//O lado que n�o tem o mappedBy � o "dono" da rela�ao
	private List<Modelo> modelos;
	
	public Marca() {
	}
	
	public Marca(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public DetalheMarca getDetalheMarca() {
		return detalheMarca;
	}

	public void setDetalheMarca(DetalheMarca detalheMarca) {
		this.detalheMarca = detalheMarca;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}