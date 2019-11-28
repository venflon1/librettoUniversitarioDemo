package it.ra.librettounivesitario.model;

import java.util.Date;

import it.ra.librettounivesitario.exception.IllegalVotoException;

public class VotoInTrentesimi extends Voto{
	private int voto;
	private boolean lode;
	public VotoInTrentesimi() {
		super();
	}
	
	public VotoInTrentesimi(int voto, boolean lode, Corso corso, Date data) throws IllegalVotoException {
		this();
		if(voto < 0 || voto > 30)
			throw new IllegalVotoException("range voto non valido");
		if(lode == true && voto != 30)
			throw new IllegalVotoException("lode voto non ammessa");
		
		this.voto = voto;
		this.lode = lode;
		this.setCorso(corso);
		this.setDate(data);
	}
	
	public VotoInTrentesimi(int voto, Corso corso, Date data) throws IllegalVotoException {
		this(voto, false, corso, data);
	}
	
	@Override
	public boolean isBinaryVoto() {
		return false;
	}

	public int getVoto() {
		return this.voto;
	}
	
	@Override
	public String getEsito() {
		return new Integer(this.voto).toString();
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public boolean isLode() {
		return lode;
	}

	public void setLode(boolean lode) {
		this.lode = lode;
	}

	@Override
	public String toString() {
		return super.toString() +  "[VotoInTrentesimi [voto=" + voto + ", lode=" + lode + "]]";
	}

	
}
