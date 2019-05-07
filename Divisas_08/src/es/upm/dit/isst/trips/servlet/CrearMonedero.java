package es.upm.dit.isst.trips.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CrearMonedero
 */
@WebServlet("/CrearMonedero")
public class CrearMonedero extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int concurrency = Integer.parseInt(request.getParameter("currency"));
		
	
	}

}
