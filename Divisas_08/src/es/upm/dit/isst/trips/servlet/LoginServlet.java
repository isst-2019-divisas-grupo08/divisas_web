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

@WebServlet("/LoginServlet")
class LoginServlet extends HttpServlet{
	private final String USER_ADMIN = "admin";
	private final String PASS_ADMIN = "admin";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/Login.jsp").forward(req, resp);
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
				if ( currentUser.hasRole( "admin" ) && USER_ADMIN.equals(email) && PASS_ADMIN.equals(pass) ) {
					resp.sendRedirect( req.getContextPath() + "/AdminView.jsp" );
				}
				else if ( currentUser.hasRole( "user" ) ) {
					resp.sendRedirect( req.getContextPath() + "/UserServlet?email=" + currentUser.getPrincipal() );
				}
				else {
					resp.sendRedirect( req.getContextPath() + "/RegisterServlet?email=" + currentUser.getPrincipal() );
				}
				} catch ( Exception e ) {
				resp.sendRedirect( req.getContextPath() + "/LoginErrorServlet" );
			}
		} else
			resp.sendRedirect( req.getContextPath() + "/LoginErrorServlet" );
	}
}
