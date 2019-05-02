package es.upm.dit.isst.trips.dao;

import es.upm.dit.isst.trips.model.Cliente;

public interface ClienteDAO {
	
	public void createCliente(Cliente cliente);

	public Cliente readCliente(int id);

	public void updateCliente(Cliente cliente);

	public void deleteCliente(Cliente cliente);

}
