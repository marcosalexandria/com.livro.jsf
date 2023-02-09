package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class DetalheMarca {
	@Id @GeneratedValue
	private Long id;
	
	private Integer anoFundacao;
	
	@Column(length = 20)
	private String paisOrigem;
	
	@Column(length = 80)
	private String fundador;
	
	//o lado que não é o dono indica quem tem esse papel através do atributo mappedBy
	@OneToOne(mappedBy = "detalheMarca")
	private Marca marca;
	
	public DetalheMarca() {
	}

	public DetalheMarca(Long id, Integer anoFundacao, String paisOrigem, String fundador, Marca marca) {
		super();
		this.id = id;
		this.anoFundacao = anoFundacao;
		this.paisOrigem = paisOrigem;
		this.fundador = fundador;
		this.marca = marca;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAnoFundacao() {
		return anoFundacao;
	}

	public void setAnoFundacao(Integer anoFundacao) {
		this.anoFundacao = anoFundacao;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public String getFundador() {
		return fundador;
	}

	public void setFundador(String fundador) {
		this.fundador = fundador;
	}

	public Marca getMarca() {
		return marca;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
}
