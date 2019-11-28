package it.ra.librettouniversitario.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import it.ra.librettounivesitario.exception.IllegalCorsoException;
import it.ra.librettounivesitario.exception.IllegalDocenteException;
import it.ra.librettounivesitario.model.Corso;
import it.ra.librettounivesitario.model.Docente;

class CorsoTest {
	private Corso corso;
	
	@Test
	void testMethodAdd() throws IllegalDocenteException, IllegalCorsoException {
		String nomeCorso = "Filosofia";
		Docente doc = new Docente("Filippo", "Ponti");
		
		corso = new Corso(nomeCorso, doc);
		assertNotNull(corso);
		assertEquals("Filosofia", corso.getNomeCorso());
		assertEquals(1, corso.getListaDocenti().size());
	}

}
