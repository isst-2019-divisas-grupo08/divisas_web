package es.upm.dit.isst.trips.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.upm.dit.isst.trips.dao.MonederoDAO;
import es.upm.dit.isst.trips.dao.MonederoDAOImplementation;
import es.upm.dit.isst.trips.model.Monedero;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.upm.dit.isst.trips.model.Operacion;

class TestMonederoDAOImplementation {

	private Monedero m;

	@BeforeEach
	void setUp() throws Exception {
		m = new Monedero();
		m.setId(1);;
		MonederoDAOImplementation.getInstance().createMonedero(m);
	}

	@AfterEach
	void tearDown() throws Exception {
		MonederoDAOImplementation.getInstance().deleteMonedero(m);
		m = null;
	}

	@Test
	void testCreateMonedero() {
		MonederoDAO dao = MonederoDAOImplementation.getInstance();
		Monedero monedero = new Monedero();
		monedero.setId(1);
		dao.createMonedero(monedero);
		
		Monedero compare = dao.readMonedero(1);
		assertEquals(compare, monedero.getId());
		//assertTrue(true);
		
		
	}

	@Test
	void testReadMonedero() {
		MonederoDAO dao = MonederoDAOImplementation.getInstance();
		Monedero compare = dao.readMonedero(1);
		assertEquals(compare,m.getId());
	}

	@Test
	void testUpdateMonedero() {
		MonederoDAO dao = MonederoDAOImplementation.getInstance();
		m.setId(2);
		dao.updateMonedero(m);
		Monedero compare = dao.readMonedero(2);
		assertEquals(compare,m.getId());
	}

	@Test
	void testDeleteMonedero() {
		MonederoDAO dao = MonederoDAOImplementation.getInstance();
		dao.deleteMonedero(m);
		assertEquals(0,dao.readMonedero(1));
	}
}
