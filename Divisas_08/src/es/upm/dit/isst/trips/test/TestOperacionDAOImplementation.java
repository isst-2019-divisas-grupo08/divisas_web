package es.upm.dit.isst.trips.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.upm.dit.isst.trips.dao.OperacionDAO;
import es.upm.dit.isst.trips.dao.OperacionDAOImplementation;
import es.upm.dit.isst.trips.model.Operacion;

class TestOperacionDAOImplementation {
	
	private Operacion op;

	@BeforeEach
	void setUp() throws Exception {
		op = new Operacion();
		op.setIdOperacion(1);;
		OperacionDAOImplementation.getInstance().createOperacion(op);
	}

	@AfterEach
	void tearDown() throws Exception {
		OperacionDAOImplementation.getInstance().deleteOperacion(op);
		op = null;
	}

	@Test
	void testCreateOperacion() {
		OperacionDAO dao = OperacionDAOImplementation.getInstance();
		Operacion operacion = new Operacion();
		operacion.setIdOperacion(1);
		dao.createOperacion(operacion);
		
		Operacion compare = dao.readOperacion(1);
		assertEquals(compare, operacion.getIdOperacion());
		//assertTrue(true);
		
		
	}

	@Test
	void testReadOperacion() {
		OperacionDAO dao = OperacionDAOImplementation.getInstance();
		Operacion compare = dao.readOperacion(1);
		assertEquals(compare,op.getIdOperacion());
	}

	@Test
	void testUpdateOperacion() {
		OperacionDAO dao = OperacionDAOImplementation.getInstance();
		op.setIdOperacion(2);
		dao.updateOperacion(op);
		Operacion compare = dao.readOperacion(2);
		assertEquals(compare,op.getIdOperacion());
	}

	@Test
	void testDeleteOperacion() {
		OperacionDAO dao = OperacionDAOImplementation.getInstance();
		dao.deleteOperacion(op);
		assertEquals(0,dao.readOperacion(1));
	}
	
}	