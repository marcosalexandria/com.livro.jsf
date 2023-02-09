package model.embeddeds;

import javax.persistence.Embeddable;

@Embeddable
public class Documentacao {
	private String rg;
	private String orgaoExpedidor;
	private String cpf;
	private String tituloEleitor;
	private Integer secao;
	private Integer zona;
	private String naturalidade;
	private String nacionalidade;
	private String nomeMae;
	private String nomePai;

	public Documentacao() {
	}

	public Documentacao(String rg, String orgaoExpedidor, String cpf, String tituloEleitor, Integer secao, Integer zona,
			String naturalidade, String nacionalidade, String nomeMae, String nomePai) {
		super();
		this.rg = rg;
		this.orgaoExpedidor = orgaoExpedidor;
		this.cpf = cpf;
		this.tituloEleitor = tituloEleitor;
		this.secao = secao;
		this.zona = zona;
		this.naturalidade = naturalidade;
		this.nacionalidade = nacionalidade;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getOrgaoExpedidor() {
		return orgaoExpedidor;
	}

	public void setOrgaoExpedidor(String orgaoExpedidor) {
		this.orgaoExpedidor = orgaoExpedidor;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTituloEleitor() {
		return tituloEleitor;
	}

	public void setTituloEleitor(String tituloEleitor) {
		this.tituloEleitor = tituloEleitor;
	}

	public Integer getSecao() {
		return secao;
	}

	public void setSecao(Integer secao) {
		this.secao = secao;
	}

	public Integer getZona() {
		return zona;
	}

	public void setZona(Integer zona) {
		this.zona = zona;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
}