package es.upm.dit.isst.trips.servlet;

import java.io.IOException;
import java.util.Collection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import es.upm.dit.isst.trips.dao.ClienteDAO;
import es.upm.dit.isst.trips.dao.ClienteDAOImplementation;
import es.upm.dit.isst.trips.model.Cliente;



@WebServlet({ "/UserServlet" })
public class UserServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Subject currentUser = SecurityUtils.getSubject();
		if(!currentUser.isAuthenticated()) {
			getServletContext().getRequestDispatcher("/Login.jsp").forward(req, resp);
			return;
		}
		ClienteDAO cdao = ClienteDAOImplementation.getInstance();
		String email = currentUser.getPrincipal().toString();
		Cliente currentUserInfo = cdao.readCliente(currentUser.getPrincipal().toString());
		
		System.out.println("Current User: "+currentUser.getPrincipal()+"is "+currentUser.isAuthenticated());
		
		req.setAttribute("cliente", currentUserInfo);
		getServletContext().getRequestDispatcher( "/MyData.jsp" ).forward(req, resp);
	}
}