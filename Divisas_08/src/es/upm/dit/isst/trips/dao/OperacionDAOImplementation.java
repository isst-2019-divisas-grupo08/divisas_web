package es.upm.dit.isst.trips.dao;

import org.hibernate.Session;

import es.upm.dit.isst.trips.model.Operacion;

public class OperacionDAOImplementation implements OperacionDAO {

	private static OperacionDAOImplementation instance;
	private OperacionDAOImplementation() {};
	public static OperacionDAOImplementation getInstance() {
		if(null == instance) {
			instance = new OperacionDAOImplementation();
		}
		return instance;
	}
	
	@Override
	public void createOperacion(Operacion operacion) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.save(operacion);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			
		}finally {
			session.close();
		}
		
	}

	@Override
	public Operacion readOperacion(int idOperacion) {
		
		Session session = SessionFactoryService.get().openSession();
		Operacion operacion = null;
		try {
			session.beginTransaction();
			operacion = (Operacion) session.createQuery("select a from Operacion a where a.idOperacion = :idOperacion")
					.setParameter("idOperacion", idOperacion)
					.getSingleResult();
			session.getTransaction().commit();
			
		} catch (Exception e) {
			
		}finally {
			session.close();
		}
			return operacion;
	}

	@Override
	public void updateOperacion(Operacion operacion) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.saveOrUpdate(operacion);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			
		}finally {
			session.close();
		}
		
	}

	@Override
	public void deleteOperacion(Operacion operacion) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.delete(operacion);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			
		}finally {
			session.close();
		}
		
	}

}
