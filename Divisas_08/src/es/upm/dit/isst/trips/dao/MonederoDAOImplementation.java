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
	public Monedero readMonedero(int idMonedero) {
		
		Session session = SessionFactoryService.get().openSession();
		Monedero monedero = null;
		try {
			session.beginTransaction();
			monedero = (Monedero) session.createQuery("select a from Monedero a where a.idMonedero = :idMonedero")
					.setParameter("idMonedero", idMonedero)
					.getSingleResult();
			session.getTransaction().commit();
			
		} catch (Exception e) {
			
		}finally {
			session.close();
		}
			return monedero;
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
