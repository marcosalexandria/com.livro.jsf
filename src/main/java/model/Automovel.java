package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Automovel {
	@Id
	@GeneratedValue
	private Long id;

	private String marca;
	private String modelo;
	private Integer anoFabricacao;
	private Integer anoModelo;
	private String observacoes;
	@ManyToMany
	//Configurando a tabela auxilixar, @JoinTable é colocada na entidade dona do relacionamento
	@JoinTable(name = "T_AUTOMOVEIS_OPCIONAIS",
			   joinColumns = @JoinColumn(name ="AUTO_ID"),
			   inverseJoinColumns = @JoinColumn(name = "OPCIONAL_ID")
			   )
	private List<Opcionais> opcionais = new ArrayList<>();

	public Automovel() {
	}

	public Automovel(Long id, String marca, String modelo, Integer anoFabricacao, Integer anoModelo,
			String observacoes) {

		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.observacoes = observacoes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Integer getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public List<Opcionais> getOpcionais() {
		return opcionais;
	}

	public void setOpcionais(List<Opcionais> opcionais) {
		this.opcionais = opcionais;
	}

	@Override
	public String toString() {
		return "Automovel [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", anoFabricacao=" + anoFabricacao
				+ ", anoModelo=" + anoModelo + ", observacoes=" + observacoes + ", opcionais=" + opcionais + "]";
	}
}