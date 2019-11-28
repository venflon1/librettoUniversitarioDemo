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
import it.ra.librettounivesitario.model.Voto;
import it.ra.librettounivesitario.model.VotoInTrentesimi;

class VotoInTrentesimiTest {
	private Voto voto;

	@Test
	void test() throws IllegalVotoException, IllegalDocenteException, IllegalCorsoException {
		Docente doc = new Docente("Anna Maria", "Morpurgo");
		Corso corso = new Corso("Programmazione 1", doc);
		Date data = new Date();
		
		voto = new VotoInTrentesimi(21, false, corso, data);
		assertNotNull(voto);
		assertEquals("21", voto.getEsito());
		
	}
}