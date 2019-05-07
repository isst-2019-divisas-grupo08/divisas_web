package es.upm.dit.isst.trips.servlet;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.crypto.hash.Sha256Hash;

import es.upm.dit.isst.trips.dao.ClienteDAO;
import es.upm.dit.isst.trips.dao.ClienteDAOImplementation;
import es.upm.dit.isst.trips.dao.CuentaDAO;
import es.upm.dit.isst.trips.dao.CuentaDAOImplementation;
import es.upm.dit.isst.trips.model.Cliente;
import es.upm.dit.isst.trips.model.Cuenta;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		getServletContext().getRequestDispatcher( "/Register.jsp" ).forward( req,resp );
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String password = req.getParameter( "password" );
		String email = req.getParameter( "email" );
		String nombre = req.getParameter( "nombre" );
		String apellido = req.getParameter( "apellido" );
		String DNI = req.getParameter( "DNI" );
		String pais = req.getParameter( "pais" );
		String direccion = req.getParameter( "direccion" );
		
		Cliente cliente = new Cliente();
		cliente.setEmail( email );
		cliente.setPassword( new Sha256Hash( password ).toString() );
		cliente.setRole("cliente");
		cliente.setNombre(nombre);
		cliente.setApellido(apellido);
		cliente.setDNI(DNI);
		cliente.setPais(pais);
		cliente.setDireccion(direccion);
		
		//Cuenta cuenta = new Cuenta();
		//cuenta.setCliente(cliente);
		//cuenta.setTarjeta(00000000);
		//cliente.setCuenta(cuenta);
		
		//CuentaDAO cuentaDao = CuentaDAOImplementation.getInstance();
		//cuentaDao.createCuenta(cuenta);
		
		ClienteDAO cdao = ClienteDAOImplementation.getInstance();
		cdao.createCliente(cliente);
		
		resp.sendRedirect( req.getContextPath() + "/Login.jsp" );
	}
}
