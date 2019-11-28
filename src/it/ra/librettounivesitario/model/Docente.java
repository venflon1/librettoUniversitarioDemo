package it.ra.librettounivesitario.model;

import it.ra.librettounivesitario.exception.IllegalDocenteException;

public class Docente {
	private String nome;
	private String cognome;
	
	public Docente() {
		super();
	}
	
	public Docente(String nome, String cognome) throws IllegalDocenteException {
		this();
		if(nome.equals("") || nome == null)
			throw new IllegalDocenteException("docente non puo' non avere il nome");
		if(nome.equals("") || nome == null)
			throw new IllegalDocenteException("docente non puo' non avere il nome");
		
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Docente other = (Docente) obj;
		if (cognome == null) {
			if (other.cognome != null)
				return false;
		} else if (!cognome.equals(other.cognome))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Docente [nome=" + nome + ", cognome=" + cognome + "]";
	}
}
