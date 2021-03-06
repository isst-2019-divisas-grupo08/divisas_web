package es.upm.dit.isst.trips.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import es.upm.dit.isst.trips.dao.ClienteDAO;
import es.upm.dit.isst.trips.dao.ClienteDAOImplementation;
import es.upm.dit.isst.trips.dao.CuentaDAO;
import es.upm.dit.isst.trips.dao.CuentaDAOImplementation;
import es.upm.dit.isst.trips.dao.MonederoDAO;
import es.upm.dit.isst.trips.dao.MonederoDAOImplementation;
import es.upm.dit.isst.trips.model.Cliente;
import es.upm.dit.isst.trips.model.Cuenta;
import es.upm.dit.isst.trips.model.Monedero;

/**
 * Servlet implementation class CrearMonedero
 */
@WebServlet("/CrearMonederoServlet")
public class CrearMonederoServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Subject currentUser = SecurityUtils.getSubject();
		if(!currentUser.isAuthenticated()) {
			getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
			return;
		}
		//Read input
		int currency = Integer.parseInt(request.getParameter("currency"));
		//Check if input is valid
		if(!Monedero.checkValidCurrencyId(currency)) {
			getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
			return;
		}
		//Get user cuenta
		ClienteDAO cdao = ClienteDAOImplementation.getInstance();
		Cliente clientP = cdao.readCliente(currentUser.getPrincipal().toString());
		
		CuentaDAO cuentadao = CuentaDAOImplementation.getInstance();
		Cuenta cuenta = cuentadao.readCuenta(clientP.getCuenta().getNumeroCuenta());
		
		if(!monederoMismaMonedaExiste(cuenta.getMonederos(), currency)) {
			//Generate new monedero
			Monedero monedero = new Monedero(currency);
			clientP.getCuenta().getMonederos().add(monedero);
			monedero.setSaldo(200);
			cdao.updateCliente(clientP);
		}else
		{
			Monedero monedero = new Monedero(currency);
			monedero.setSaldo(200);
			cdao.updateCliente(clientP);
		}
		
		response.sendRedirect( request.getContextPath() + "/WalletServlet" );
	}

	private boolean monederoMismaMonedaExiste(Set<Monedero> monederosUsuario,int nuevaCurrency) {
		for(Monedero monedero : monederosUsuario) {
			if(monedero.getDivisa() == Monedero.getDivisaFromInt(nuevaCurrency)){
				return true;
			}
		}
		return false;
	}
	
}
