package es.upm.dit.isst.trips.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.crypto.hash.Sha256Hash;

import es.upm.dit.isst.trips.dao.ClienteDAO;
import es.upm.dit.isst.trips.dao.ClienteDAOImplementation;
import es.upm.dit.isst.trips.model.Cliente;

@WebServlet("/CreateUserServlet")
public class CreateUserServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter( "name" );
		String password = req.getParameter( "password" );
		String email = req.getParameter( "email" );
		Cliente cliente = new Cliente();
		cliente.setNombre( name );
		cliente.setEmail( email );
		cliente.setPassword( new Sha256Hash( password ).toString() );
		
		ClienteDAO cdao = ClienteDAOImplementation.getInstance();
		cdao.createCliente(cliente);
		
		resp.sendRedirect( req.getContextPath() + "/UserServlet" );
	}
}
