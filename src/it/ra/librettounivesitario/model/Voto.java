package it.ra.librettounivesitario.model;

import java.util.Date;

public abstract class Voto {
	private Corso corso;
	private Date data;
	
	public Voto() {
		super();
	}
	
	public Voto(Corso corso, Date data) {
		this();
		this.corso = corso;
		this.data = data;
	}
	
	public Corso getCorso() {
		return corso;
	}
	
	public void setCorso(Corso corso) {
		this.corso = corso;
	}

	public Date getData() {
		return data;
	}
	
	public void setDate(Date data) {
		this.data = data;
	}

	public abstract boolean isBinaryVoto();	
	
	public abstract String getEsito();

	@Override
	public String toString() {
		return "Voto [corso=" + corso + ", data=" + data + " ";
	}
	
	
}
