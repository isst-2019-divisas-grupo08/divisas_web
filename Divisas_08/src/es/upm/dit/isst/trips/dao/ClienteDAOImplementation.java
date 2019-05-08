package es.upm.dit.isst.trips.dao;

import java.util.*;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import es.upm.dit.isst.trips.model.Cliente;

public class ClienteDAOImplementation implements ClienteDAO {
	private static ClienteDAOImplementation instance;

	private ClienteDAOImplementation() {
	}

	public static ClienteDAOImplementation getInstance() {
		if (null == instance) {
			instance = new ClienteDAOImplementation();
		}
		return instance;
	}

	@Override
	public void createCliente(Cliente cliente) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.save(cliente);
			session.getTransaction().commit();

		} catch (Exception e) {

		} finally {
			session.close();
		}

	}

	@Override
	public Cliente readCliente(String email) {
		Session session = SessionFactoryService.get().openSession();
		Cliente cliente = null;
		try {
			session.beginTransaction();
			cliente = session.get(Cliente.class, email);
			session.getTransaction().commit();
		} catch (Exception e) {
		} finally {
			session.close();
		}
		return cliente;
	}

	@Override
	public void updateCliente(Cliente cliente) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.saveOrUpdate(cliente);
			session.getTransaction().commit();

		} catch (Exception e) {

		} finally {
			session.close();
		}

	}

	@Override
	public void deleteCliente(Cliente cliente) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.delete(cliente);
			session.getTransaction().commit();

		} catch (Exception e) {

		} finally {
			session.close();
		}

	}

}
