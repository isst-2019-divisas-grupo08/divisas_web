package es.upm.dit.isst.trips.dao;

import org.hibernate.Session;

import es.upm.dit.isst.trips.model.Cuenta;

public class CuentaDAOImplementation implements CuentaDAO {
	private static CuentaDAOImplementation instance;
	private CuentaDAOImplementation() {};
	public static CuentaDAOImplementation getInstance() {
		if(null == instance) {
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
			
		}finally {
			session.close();
		}
		
	}

	@Override
	public int readCuenta(int numeroCuenta) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateCuenta(Cuenta cuenta) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.saveOrUpdate(cuenta);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			
		}finally {
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
			
		}finally {
			session.close();
		}
		
	}

}
