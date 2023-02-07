package controller;

import javax.faces.bean.ManagedBean;

import model.Automovel;

@ManagedBean
public class AutomovelBean {
	
	private Automovel automovel = new Automovel();
	
	public Automovel getAutomovel() {
		return automovel;
	}

	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}


	public void salvar(Automovel automovel) {
		System.out.println(automovel.getMarca());
	}
}
