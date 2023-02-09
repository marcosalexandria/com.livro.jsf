package controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import model.Automovel;
import repository.AutomovelRepository;

@ManagedBean
public class AutomovelBean {

	private Automovel automovel = new Automovel();
	AutomovelRepository automovelRepository = new AutomovelRepository();
	private List<Automovel> automoveis;

	public void salvar() {
		automovelRepository.salvar(automovel);
	}

	public List<Automovel> getAutomoveis() {
		if (automoveis == null) {
			automoveis = automovelRepository.todos();
		}
		return automoveis;
	}

	public void exclui(Automovel automovel) {
		automovelRepository.exclui(automovel);
	}

	public Automovel getAutomovel() {
		return automovel;
	}

	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}
}