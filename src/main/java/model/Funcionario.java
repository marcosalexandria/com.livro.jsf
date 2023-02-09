package model;

import java.time.LocalDate;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import model.embeddeds.Documentacao;
import model.embeddeds.Endereco;

@Entity
@Table(name = "funcionario")
public class Funcionario {
	@Id
	@GeneratedValue
	private Integer id;

	private String nome;
	private LocalDate nascimento;

	@Embedded
	private Documentacao documentacao;

	@Embedded
	private Endereco endereco;

	@ManyToOne
	private Cargo cargo;

	public Funcionario() {
	}

	public Funcionario(Integer id, String nome, LocalDate nascimento, Documentacao documentacao, Endereco endereco,
			Cargo cargo) {
		super();
		this.id = id;
		this.nome = nome;
		this.nascimento = nascimento;
		this.documentacao = documentacao;
		this.endereco = endereco;
		this.cargo = cargo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public Documentacao getDocumentacao() {
		return documentacao;
	}

	public void setDocumentacao(Documentacao documentacao) {
		this.documentacao = documentacao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
}