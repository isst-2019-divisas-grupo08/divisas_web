package es.upm.dit.isst.trips.dao;

import java.util.Collection;

import org.hibernate.Session;

import es.upm.dit.isst.trips.model.Cliente;
import es.upm.dit.isst.trips.model.Cuenta;

public class CuentaDAOImplementation implements CuentaDAO {
	private static CuentaDAOImplementation instance;

	private CuentaDAOImplementation() {
	};

	public static CuentaDAOImplementation getInstance() {
		if (null == instance) {
			instance = new CuentaDAOImplementation();
		}
		return instance;
	}

	@Override
	public void createCuenta(Cuenta cuenta) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.save(cuenta);
			session.getTransaction().commit();

		} catch (Exception e) {

		} finally {
			session.close();
		}

	}

	@Override
	public Cuenta readCuenta(int numeroCuenta) {

		Session session = SessionFactoryService.get().openSession();
		Cuenta cuenta = null;
		try {
			session.beginTransaction();
			cuenta = (Cuenta) session.createQuery("select a from Cuenta a where a.numeroCuenta = :numeroCuenta")
					.setParameter("numeroCuenta", numeroCuenta).getSingleResult();
			session.getTransaction().commit();

		} catch (Exception e) {

		} finally {
			session.close();
		}
		return cuenta;
	}

	@Override
	public void updateCuenta(Cuenta cuenta) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.saveOrUpdate(cuenta);
			session.getTransaction().commit();

		} catch (Exception e) {

		} finally {
			session.close();
		}

	}

	@Override
	public void deleteCuenta(Cuenta cuenta) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.delete(cuenta);
			session.getTransaction().commit();

		} catch (Exception e) {

		} finally {
			session.close();
		}

	}

	@SuppressWarnings({ "unchecked", "finally" })
	@Override
	public Collection<Cuenta> readAll() {
		Session session = SessionFactoryService.get().openSession();
		Collection<Cuenta> cuentas = null;
		try {
			session.beginTransaction();
			cuentas = session.createQuery("from Cuenta").list();
			session.getTransaction().commit();
		} catch (Exception e) {

		} finally {
			session.close();
			return cuentas;
		}
	}

	@Override
	public Cuenta readCuentaFromUserId(int userId) {
		Session session = SessionFactoryService.get().openSession();
		Cuenta cuenta = null;
		try {
			session.beginTransaction();
			cuenta = (Cuenta) session.createQuery("from Cuenta where client_id=:client_id")
					.setParameter("client_id", userId).getSingleResult();
			session.getTransaction().commit();

		} catch (Exception e) {

		} finally {
			session.close();
		}
		return cuenta;
	}

}
