package es.upm.dit.isst.trips.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.trips.dao.*;

import es.upm.dit.isst.trips.model.*;

@SuppressWarnings("serial")
public class BorrarMonedero extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		int idMborrar = Integer.parseInt(req.getParameter("idMborrar"));
		

		
		MonederoDAO monDao = MonederoDAOImplementation.getInstance();
		Monedero monedero = monDao.readMonedero(idMborrar);
		monDao.deleteMonedero(monedero);

		//monDao.updateMonedero(monedero);;
		
		resp.sendRedirect("/Wallet");
	}
}
