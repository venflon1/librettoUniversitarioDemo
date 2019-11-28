package it.ra.librettouniversitario.model.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;

import it.ra.librettounivesitario.exception.IllegalCorsoException;
import it.ra.librettounivesitario.exception.IllegalDocenteException;
import it.ra.librettounivesitario.exception.IllegalVotoException;
import it.ra.librettounivesitario.model.Corso;
import it.ra.librettounivesitario.model.Docente;
import it.ra.librettounivesitario.model.Libretto;
import it.ra.librettounivesitario.model.Voto;
import it.ra.librettounivesitario.model.VotoInTrentesimi;

class LibrettoTest {
	private Libretto libretto = new Libretto();
	
	@Test
	void testMethodAdd() throws IllegalVotoException, IllegalDocenteException, IllegalCorsoException {
		Docente doc1 = new Docente("Giovanni", "Pighizzini");
		Docente doc2 = new Docente("Anna Maria", "Morpurgo");
		Corso corso = new Corso("Programmazione 1", doc1, doc2);
		Date data = new Date();
		Voto voto = new VotoInTrentesimi(30, true, corso, data);
		libretto.add(voto);
		
		assertNotNull(libretto);
		assertEquals(1, libretto.getListaVoti().size());
	}	
}
 