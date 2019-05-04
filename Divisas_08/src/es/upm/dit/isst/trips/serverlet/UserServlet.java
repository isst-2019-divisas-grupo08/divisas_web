package es.upm.dit.isst.trips.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import es.upm.dit.isst.trips.dao.MonederoDAO;
import es.upm.dit.isst.trips.dao.MonederoDAOImplementation;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		MonederoDAO mdao = MonederoDAOImplementation.getInstance();
		req.getSession().setAttribute( "monedero_list", mdao.readAll() );
		
		getServletContext().getRequestDispatcher( "/MyData.jsp" ).forward( req, resp );
	}
}
