package es.upm.dit.isst.trips.dao;

import org.hibernate.Session;

import es.upm.dit.isst.trips.model.Cambio;


public class CambioDAOImplementation implements CambioDAO {
	
	private static CambioDAOImplementation instance;
	private CambioDAOImplementation() {};
	public static CambioDAOImplementation getInstance() {
		if(null == instance) {
			instance = new CambioDAOImplementation();
		}
		return instance;
	}
	
	@Override
	public void createCambio(Cambio cambio) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.save(cambio);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			
		}finally {
			session.close();
		}
	}

	@Override
	public Cambio readCambio(int idCambio) {
		Session session = SessionFactoryService.get().openSession();
		Cambio cambio = null;
		try {
			session.beginTransaction();
			cambio = (Cambio) session.createQuery("select a from Cambio a where a.idCambio = :idCambio")
					.setParameter("idCambio", idCambio)
					.getSingleResult();
			session.getTransaction().commit();
			
		} catch (Exception e) {
			
		}finally {
			session.close();
		}
			return cambio;
	}

	@Override
	public void updateCambio(Cambio cambio) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.saveOrUpdate(cambio);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			
		}finally {
			session.close();
		}
	}

	@Override
	public void deleteCambio(Cambio cambio) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.delete(cambio);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			
		}finally {
			session.close();
		}
	}

}
