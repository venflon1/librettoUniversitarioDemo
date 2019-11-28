package it.ra.librettouniversitario.model.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import it.ra.librettounivesitario.exception.IllegalDocenteException;
import it.ra.librettounivesitario.model.Docente;

class DocenteTest {
	private Docente docente;
	
	@Test
	void test() throws IllegalDocenteException {
		docente = new Docente("Pino", "Insegno");

		assertNotNull(docente);
		assertEquals("Pino", docente.getNome());
		assertEquals("Insegno", docente.getCognome());
	}

}
