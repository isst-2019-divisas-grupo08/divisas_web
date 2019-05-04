package es.upm.dit.isst.trips.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

import es.upm.dit.isst.trips.dao.ClienteDAO;
import es.upm.dit.isst.trips.dao.ClienteDAOImplementation;
import es.upm.dit.isst.trips.model.Cliente;
import es.upm.dit.isst.trips.model.Cuenta;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String email = req.getParameter("email");

		ClienteDAO cdao = ClienteDAOImplementation.getInstance();
		Cliente cliente = new Cliente();
//		cliente = cdao.read(email);
		
		req.getSession().setAttribute( "name", cliente.getNombre() );
		req.getSession().setAttribute( "email", cliente.getEmail() );

		req.getSession().setAttribute("dni", cliente.getDNI());
		req.getSession().setAttribute("cuenta", cliente.getCuenta());

		
		getServletContext().getRequestDispatcher( "/Operations.jsp" ).forward( req, resp );
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter( "email" );
		String name = req.getParameter( "name" );
		String dni = req.getParameter( "dni" );
//		Cuenta cuenta = req.getParameter( "cuenta" );
		ClienteDAO cdao = ClienteDAOImplementation.getInstance();
//		Cliente cliente = cdao.readCliente(email);
//		cliente.setNombre( name );
//		cliente.setEmail( email );
//		cliente.setCuenta(cuenta);
//		cliente.setDNI(dni);
	
		
//		cdao.updateCliente(cliente);
		
		System.out.println(email);
		
		resp.sendRedirect( req.getContextPath() + "/UserServlet?email=" + email );
					
		
	}
}