package it.ra.librettounivesitario.model;

import java.util.Date;

public class VotoBinario extends Voto{
	private boolean approvato;	
	
	public VotoBinario() {
		super();
	}
	
	public VotoBinario(boolean approvato, Corso corso, Date data) {
		this();
		this.approvato = approvato;
		this.setCorso(corso);
		this.setDate(data);
	}

	@Override
	public boolean isBinaryVoto() {
		return true;
	}
	
	@Override
	public String getEsito() {
		return this.approvato==true?"approvato":"non approvato";
	}
	
	@Override
	public String toString() {
		return super.toString() + "[VotoBinario [approvato=" + approvato + "]]";
	}

}
