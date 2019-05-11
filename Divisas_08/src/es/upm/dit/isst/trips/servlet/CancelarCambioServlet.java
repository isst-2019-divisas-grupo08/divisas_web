package es.upm.dit.isst.trips.servlet;

import java.io.IOException;
import java.util.Collection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.trips.dao.CambioDAO;
import es.upm.dit.isst.trips.dao.CambioDAOImplementation;
import es.upm.dit.isst.trips.dao.ClienteDAO;
import es.upm.dit.isst.trips.dao.ClienteDAOImplementation;
import es.upm.dit.isst.trips.model.Cambio;
import es.upm.dit.isst.trips.model.Cliente;


@WebServlet("/CancelarCambioServlet")
public class CancelarCambioServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String action = req.getParameter("action");
		 
		 CambioDAO daoSolicitud = CambioDAOImplementation.getInstance();
		
		 int idSolicitud = Integer.parseInt(req.getParameter("idSolicitud"));
		 
		 if(action.equals("Cancelar")){
				System.out.println("Cancelar");
				Cambio solicitudEliminar = daoSolicitud.readCambio(idSolicitud);
				daoSolicitud.deleteCambio(solicitudEliminar);
		 }
		 resp.sendRedirect("/Operations");
	}
}


