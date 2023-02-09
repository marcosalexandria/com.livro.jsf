package model.embeddeds;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {
	private String logradouro;
	private Integer cep;
	private String cidade;
	private String uf;
	
	public Endereco() {
	}

	public Endereco(String logradouro, Integer cep, String cidade, String uf) {
		super();
		this.logradouro = logradouro;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
}