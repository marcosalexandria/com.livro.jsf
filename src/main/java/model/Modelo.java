package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Modelo {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Marca montadora;
	
	public Modelo() {
	}

	public Modelo(Long id, String nome, Marca montadora) {
		super();
		this.id = id;
		this.nome = nome;
		this.montadora = montadora;
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

	public Marca getMontadora() {
		return montadora;
	}

	public void setMontadora(Marca montadora) {
		this.montadora = montadora;
	}
}