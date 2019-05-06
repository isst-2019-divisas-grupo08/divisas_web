package es.upm.dit.isst.trips.servlet;

import java.io.IOException;
import java.util.Collection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import es.upm.dit.isst.trips.dao.ClienteDAO;
import es.upm.dit.isst.trips.dao.ClienteDAOImplementation;
import es.upm.dit.isst.trips.model.Cliente;



@WebServlet({ "/AdminServlet" })
public class AdminServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ClienteDAO cdao = ClienteDAOImplementation.getInstance();
		Collection<Cliente> clientes = cdao.readAll();
		req.setAttribute("cliente_list", clientes);
		getServletContext().getRequestDispatcher( "/HomeAdmin.jsp" ).forward( req, resp );
	}

}
