package es.upm.dit.isst.trips.dao;

import es.upm.dit.isst.trips.model.Cliente;

import java.util.*;


public interface ClienteDAO {
	
	public void createCliente(Cliente cliente);

	public Cliente readCliente(String nombre);

	public void updateCliente(Cliente cliente);

	public void deleteCliente(Cliente cliente);
	
	public Collection<Cliente> readAll();

}





