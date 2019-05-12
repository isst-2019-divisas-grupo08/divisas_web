package es.upm.dit.isst.trips.dao;

import es.upm.dit.isst.trips.model.Cliente;

import java.util.*;


public interface ClienteDAO {
	
	public void createCliente(Cliente cliente);

	public Cliente readCliente(String email);

	public void updateCliente(Cliente cliente);

	public void deleteCliente(Cliente cliente);

}





