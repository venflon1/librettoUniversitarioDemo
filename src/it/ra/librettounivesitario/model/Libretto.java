package it.ra.librettounivesitario.model;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Libretto {
//	private Logger logger = Logger.getLogger(Libretto.class.getClass());
	
	private List<Voto> listaVoti;
	
	public Libretto() {
		super();
	}
	
	public List<Voto> getListaVoti() {
		return listaVoti;
	}

	public void add(Voto voto) {
		if(this.listaVoti == null)
			this.listaVoti = new ArrayList<Voto>();
		
		this.listaVoti.add(voto);
	}
}