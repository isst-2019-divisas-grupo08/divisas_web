package es.upm.dit.isst.trips.serverlet;

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

@WebServlet({ "/LoginServlet", "/" })
class LoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ClienteDAO cdao = ClienteDAOImplementation.getInstance();
		req.getSession().setAttribute( "client_list", cdao.readAll() );
		getServletContext().getRequestDispatcher( "/MyData.jsp" ).forward( req, resp );
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter( "email" );
		String pass = req.getParameter( "password" );
		Subject currentUser = SecurityUtils.getSubject();
		if ( !currentUser.isAuthenticated() ) {
			UsernamePasswordToken token = new UsernamePasswordToken( email, pass );
			try {
				currentUser.login( token );
				if ( currentUser.hasRole( "admin" ) )
					resp.sendRedirect( req.getContextPath() + "/AdminServlet" );
				else if ( currentUser.hasRole( "user" ) )
					resp.sendRedirect( req.getContextPath() + "/UserServlet?email=" + currentUser.getPrincipal() );
				else
					resp.sendRedirect( req.getContextPath() + "/UserServlet?email=" + currentUser.getPrincipal() );
			} catch ( Exception e ) {
				resp.sendRedirect( req.getContextPath() + "/LoginServlet" );
			}
		} else
			resp.sendRedirect( req.getContextPath() + "/LoginServlet" );
	}
}
