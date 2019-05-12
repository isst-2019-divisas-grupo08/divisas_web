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
		c.setEmail("prueba@gmail.com");
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
		cliente.setEmail("prueba@gmail.com");
		dao.createCliente(cliente);
		
		Cliente compare = dao.readCliente("prueba@gmail.com");
		assertEquals(compare, cliente.getEmail());
	}

	@Test
	void testReadCliente() {
		ClienteDAO dao = ClienteDAOImplementation.getInstance();
		Cliente compare = dao.readCliente("prueba@gmail.com");
		assertEquals(compare,c.getEmail());
	}

	@Test
	void testUpdateCliente() {
		ClienteDAO dao = ClienteDAOImplementation.getInstance();
		c.setEmail("prueba2@gmail.com");
		dao.updateCliente(c);
		Cliente compare = dao.readCliente("prueba2@gmail.com");
		assertEquals(compare,c.getEmail());
	}

	@Test
	void testDeleteCliente() {
		ClienteDAO dao = ClienteDAOImplementation.getInstance();
		dao.deleteCliente(c);
		assertEquals(0,dao.readCliente("prueba@gmail.com"));
	}

}
