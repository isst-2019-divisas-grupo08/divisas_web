package es.upm.dit.isst.trips.dao;

import org.hibernate.Session;

import es.upm.dit.isst.trips.model.Monedero;

public class MonederoDAOImplementation implements MonederoDAO {

	private static MonederoDAOImplementation instance;
	private MonederoDAOImplementation() {};
	public static MonederoDAOImplementation getInstance() {
		if(null == instance) {
			instance = new MonederoDAOImplementation();
		}
		return instance;
	}
	
	@Override
	public void createMonedero(Monedero monedero) {
		
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.save(monedero);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			
		}finally {
			session.close();
		}
		
	}

	@Override
	public int readMonedero(int idCambio, double interes) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateMonedero(Monedero monedero) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.saveOrUpdate(monedero);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			
		}finally {
			session.close();
		}
		
	}

	@Override
	public void deleteMonedero(Monedero monedero) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.delete(monedero);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			
		}finally {
			session.close();
		}
		
	}

}
