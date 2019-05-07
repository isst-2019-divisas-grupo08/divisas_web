package es.upm.dit.isst.trips.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.upm.dit.isst.trips.dao.ClienteDAO;
import es.upm.dit.isst.trips.dao.ClienteDAOImplementation;
import es.upm.dit.isst.trips.model.Cliente;

class TestClienteDAOImplementation {

	private Cliente c;
	
	@BeforeEach
	void setUp() throws Exception {
		c = new Cliente();
		c.setId(1);
		ClienteDAOImplementation.getInstance().createCliente(c);
	}

	@AfterEach
	void tearDown() throws Exception {
		ClienteDAOImplementation.getInstance().deleteCliente(c);
		c = null;
		
	}

	@Test
	void testCreateCliente() {
		ClienteDAO dao = ClienteDAOImplementation.getInstance();
		Cliente cliente = new Cliente();
		cliente.setId(1);
		dao.createCliente(cliente);
		
		Cliente compare = dao.readCliente(1);
		assertEquals(compare, cliente.getId());
	}

	@Test
	void testReadCliente() {
		ClienteDAO dao = ClienteDAOImplementation.getInstance();
		Cliente compare = dao.readCliente(1);
		assertEquals(compare,c.getId());
	}

	@Test
	void testUpdateCliente() {
		ClienteDAO dao = ClienteDAOImplementation.getInstance();
		c.setId(2);
		dao.updateCliente(c);
		Cliente compare = dao.readCliente(2);
		assertEquals(compare,c.getId());
	}

	@Test
	void testDeleteCliente() {
		ClienteDAO dao = ClienteDAOImplementation.getInstance();
		dao.deleteCliente(c);
		assertEquals(0,dao.readCliente(1));
	}

}
