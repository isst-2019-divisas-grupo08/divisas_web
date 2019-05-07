package es.upm.dit.isst.trips.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.upm.dit.isst.trips.dao.CambioDAO;
import es.upm.dit.isst.trips.dao.CambioDAOImplementation;
import es.upm.dit.isst.trips.model.Cambio;

class TestCambioDAOImplementation {
	
	private Cambio c;

	@BeforeEach
	void setUp() throws Exception {
		c = new Cambio();
		c.setIdCambio(1);
		c.setPrioridad("Alta");
		c.setInteres(0.02);
		c.setIdMonederoDestino(1);
		CambioDAOImplementation.getInstance().createCambio(c);
	}

	@AfterEach
	void tearDown() throws Exception {
		CambioDAOImplementation.getInstance().deleteCambio(c);
		c = null;
	}

	@Test
	void testCreateCambio() {
		CambioDAO dao = CambioDAOImplementation.getInstance();
		Cambio cambio = new Cambio();
		cambio.setIdCambio(1);
		cambio.setPrioridad("Alta");
		cambio.setInteres(0.02);
		dao.createCambio(cambio);
		
		Cambio compare = dao.readCambio(1);
		assertEquals(compare, cambio.getIdCambio());
		//assertTrue(true);
		
		
	}

	@Test
	void testReadCambio() {
		CambioDAO dao = CambioDAOImplementation.getInstance();
		Cambio compare = dao.readCambio(1);
		assertEquals(compare,c.getIdCambio());
	}

	@Test
	void testUpdateCambio() {
		CambioDAO dao = CambioDAOImplementation.getInstance();
		c.setIdCambio(2);
		dao.updateCambio(c);
		Cambio compare = dao.readCambio(2);
		assertEquals(compare,c.getIdCambio());
	}

	@Test
	void testDeleteCambio() {
		CambioDAO dao = CambioDAOImplementation.getInstance();
		dao.deleteCambio(c);
		assertEquals(0,dao.readCambio(1));
	}

}
