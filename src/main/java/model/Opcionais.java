package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Opcionais {
	@Id
	@GeneratedValue
	private Integer id;
	private String descricao;
	@ManyToMany(mappedBy = "opcionais")	//o nodo não possui mappedBy, ou seja, é a Automovel
	private List<Automovel> automoveis = new ArrayList<>();

	public Opcionais() {
	}

	public Opcionais(Integer id, String descricao, List<Automovel> automoveis) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.automoveis = automoveis;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Automovel> getAutomoveis() {
		return automoveis;
	}

	public void setAutomoveis(List<Automovel> automoveis) {
		this.automoveis = automoveis;
	}

	@Override
	public String toString() {
		return "Opcionais [id=" + id + ", descricao=" + descricao + ", automoveis=" + automoveis + "]";
	}
}