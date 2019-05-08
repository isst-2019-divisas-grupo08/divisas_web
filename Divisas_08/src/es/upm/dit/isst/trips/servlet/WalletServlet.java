package es.upm.dit.isst.trips.servlet;

import java.io.IOException;
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
import es.upm.dit.isst.trips.model.Cliente;
import es.upm.dit.isst.trips.model.Cuenta;

/**
 * Servlet implementation class WalletServlet
 */
@WebServlet("/WalletServlet")
public class WalletServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WalletServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Subject currentUser = SecurityUtils.getSubject();
		if(!currentUser.isAuthenticated()) {
			getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
			return;
		}
		ClienteDAO cdao = ClienteDAOImplementation.getInstance();
		Cliente currentUserInfo = cdao.readCliente(currentUser.getPrincipal().toString());
				
		System.out.println("Current User: "+currentUser.getPrincipal()+"is "+currentUser.isAuthenticated());
		
		request.setAttribute("monederos", currentUserInfo.getCuenta().getMonederos().toArray());
		getServletContext().getRequestDispatcher( "/Wallet.jsp" ).forward( request,response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
