package es.upm.dit.isst.trips.servlet;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.ChangedCharSetException;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.javamoney.moneta.Money;

import es.upm.dit.isst.trips.dao.ClienteDAO;
import es.upm.dit.isst.trips.dao.ClienteDAOImplementation;
import es.upm.dit.isst.trips.dao.CuentaDAO;
import es.upm.dit.isst.trips.dao.CuentaDAOImplementation;
import es.upm.dit.isst.trips.model.Cambio;
import es.upm.dit.isst.trips.model.Cliente;
import es.upm.dit.isst.trips.model.Cuenta;
import es.upm.dit.isst.trips.model.Monedero;
import es.upm.dit.isst.trips.model.SYMBOL;
import es.upm.dit.isst.trips.model.Cambio.PRIORIDADES;

import javax.money.MonetaryAmount;
import javax.money.convert.ConversionQueryBuilder;
import javax.money.convert.CurrencyConversion;
import javax.money.convert.ExchangeRateProvider;
import javax.money.convert.MonetaryConversions;


@WebServlet("/CambiarServlet")
public class CambiarServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//Check user identificated
		Subject currentUser = SecurityUtils.getSubject();
		if(!currentUser.isAuthenticated()) {
			getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
			return;
		}
		//Read Input
		String action = request.getParameter("btnAction");
		int currencyOrigin = Integer.parseInt(request.getParameter("originWallet"));
		int currencyDest = Integer.parseInt(request.getParameter("destinyWallet"));
		double moneyAmount = Double.parseDouble(request.getParameter("amountMoney"));
		
		ClienteDAO cdao = ClienteDAOImplementation.getInstance();
		Cliente clientP = cdao.readCliente(currentUser.getPrincipal().toString());
		
		//Checks
		if(!Monedero.checkValidCurrencyId(currencyOrigin) || !Monedero.checkValidCurrencyId(currencyDest)) {
			getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
			return;
		}
		
		if(!checkMonederosExists(clientP,currencyOrigin,currencyDest)) {
			getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
			return;
		}
		//TODO: Comprobar que hay dinero para el cambio
		
		
		double changeRate = calcularCambio(request, currencyOrigin, currencyDest);
		double changedMoney = moneyAmount*changeRate;
		
        if("calcChange".equals(action)){
        	request.setAttribute("moneyChange", moneyAmount);
        	request.setAttribute("rateChange", changeRate);
        	request.setAttribute("finalChange", changedMoney);
        	request.setAttribute("originList", currencyOrigin);
        	request.setAttribute("destList", currencyDest);
    		request.setAttribute("monederos", clientP.getCuenta().getMonederos().toArray());
    		getServletContext().getRequestDispatcher( "/Wallet.jsp" ).forward( request,response );
        }else if("confirmChange".equals(action)){
        	Cambio cambio = new Cambio();
        	cambio.setPrioridad(PRIORIDADES.ALTA);
        	cambio.setInteres(Cambio.INTERESALTO);
        	cambio.setRatioCambio(changeRate);
        	cambio.setOrigenDivisa(moneyAmount);
        	cambio.setOrigenDivisaSym(Monedero.getSymbolFromInt(currencyOrigin));
        	cambio.setDestDivisa(changedMoney);
        	cambio.setDestDivisaSym(Monedero.getSymbolFromInt(currencyDest));
        	cambio.setDone(false);
        	cambio.setFechaSolicitud(new Date());
        	clientP.getCuenta().getHistorialCambios().add(cambio);
        	//actualizarMonederos(clientP,currencyOrigin,currencyDest,moneyAmount,changedMoney);
        	
        	//Siempre llamar esto lo ultimo despues de cambiar todos los atributos
        	cdao.updateCliente(clientP);
        	response.sendRedirect( request.getContextPath() + "/WalletServlet" );
        } else {
            //TODO:Informar al usuario de que es subnormal
        }		

	}
	
	private double calcularCambio(HttpServletRequest request,int divisaOrigenId, int divisaDestinoId) {
		final MonetaryAmount amt = Money.of(1,Monedero.getSymbolFromInt(divisaOrigenId).name());
		ExchangeRateProvider rateProvider = MonetaryConversions.getExchangeRateProvider("IMF");
		CurrencyConversion conv= rateProvider.getCurrencyConversion(Monedero.getSymbolFromInt(divisaDestinoId).name());
		System.out.println(MessageFormat.format("2000 EUR (ECB)-> {0} = {1}",
				"ECB", amt.with(conv)));
		return amt.with(conv).getNumber().doubleValue();
	}
	
	private boolean checkMonederosExists(Cliente cliente,int currencyOrigin, int currencyDest) {
		return cliente.getCuenta().getMonederoByCurrency(currencyOrigin) != null && cliente.getCuenta().getMonederoByCurrency(currencyDest) != null;
	}
	
	private void actualizarMonederos(Cliente cliente,int currencyOrigin, int currencyDest,double moneyOrigin,double moneyDest) {
		Monedero monOrigen = cliente.getCuenta().getMonederoByCurrency(currencyOrigin);
		Monedero monDest = cliente.getCuenta().getMonederoByCurrency(currencyDest);
		monOrigen.setSaldo(monOrigen.getSaldo()-moneyOrigin);
		monDest.setSaldo(monDest.getSaldo()+moneyDest);
	}
	
}
