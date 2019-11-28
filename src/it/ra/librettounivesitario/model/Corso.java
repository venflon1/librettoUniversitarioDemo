package it.ra.librettounivesitario.model;

import java.util.ArrayList;
import java.util.List;

import it.ra.librettounivesitario.exception.IllegalCorsoException;

public class Corso {
	private String nomeCorso;
	private List<Docente> listaDocenti;
	
	public Corso() {
		super();
	}
	
	public Corso(String nomeCorso, Docente ...docenti) throws IllegalCorsoException {
		if(nomeCorso.equals(""))
			throw new IllegalCorsoException("nome corso non valido");

		if(this.listaDocenti == null)
			this.listaDocenti = new ArrayList<Docente>();
		
		for(Docente docente : docenti)
			this.listaDocenti.add(docente);
		
		this.nomeCorso = nomeCorso;
	}
	
	public Corso(String nomeCorso, List<Docente> docenti) throws IllegalCorsoException {
		this(nomeCorso, (Docente[]) docenti.toArray());
	}
	
	public String getNomeCorso() {
		return nomeCorso;
	}

	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}

	public List<Docente> getListaDocenti() {
		return listaDocenti;
	}

	public void setListaDocenti(List<Docente> listaDocenti) {
		this.listaDocenti = listaDocenti;
	}	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listaDocenti == null) ? 0 : listaDocenti.hashCode());
		result = prime * result + ((nomeCorso == null) ? 0 : nomeCorso.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Corso other = (Corso) obj;
		if (listaDocenti == null) {
			if (other.listaDocenti != null)
				return false;
		} else if (!listaDocenti.equals(other.listaDocenti))
			return false;
		if (nomeCorso == null) {
			if (other.nomeCorso != null)
				return false;
		} else if (!nomeCorso.equals(other.nomeCorso))
			return false;
		return true;
	}

	public void add(Docente doc) {
		if(this.listaDocenti == null) 
			this.listaDocenti = new ArrayList<Docente>();
		
		this.listaDocenti.add(doc);
	}

	@Override
	public String toString() {
		return "Corso [nomeCorso=" + nomeCorso + ", listaDocenti=" + listaDocenti + "]";
	}
	
	
}
