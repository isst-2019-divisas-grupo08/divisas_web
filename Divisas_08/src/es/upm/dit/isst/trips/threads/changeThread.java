package es.upm.dit.isst.trips.threads;

import java.util.Collection;
import java.util.Date;
import java.util.Set;

import es.upm.dit.isst.trips.dao.CuentaDAO;
import es.upm.dit.isst.trips.dao.CuentaDAOImplementation;
import es.upm.dit.isst.trips.model.Cambio;
import es.upm.dit.isst.trips.model.Cuenta;
import es.upm.dit.isst.trips.model.Monedero;

public class changeThread implements Runnable {

	@Override
	public void run() {
		CuentaDAO cuentadao = CuentaDAOImplementation.getInstance();
		Collection<Cuenta> todasCuentas = cuentadao.readAll();
		Date now = new Date();
		for (Cuenta cuenta : todasCuentas) {
			Set<Cambio> cambiosPendientes = cuenta.getCambiosPendientes();
			for (Cambio pendiente : cambiosPendientes) {
				if (pendiente.checkIfFinished(now)) {
					changeMonederos(cuenta, pendiente);
				}
			}
			cuentadao.updateCuenta(cuenta);
		}
	}

	private void changeMonederos(Cuenta cuenta, Cambio cambio) {
		Monedero origen = cuenta.getMonederoByCurrency(cambio.getOrigenDivisaSym());
		Monedero destino = cuenta.getMonederoByCurrency(cambio.getDestDivisaSym());
		origen.setSaldo(origen.getSaldo() - cambio.getOrigenDivisa());
		destino.setSaldo(destino.getSaldo() + cambio.getDestDivisa());
	}

	public void doShutdown() {
		// TODO Auto-generated method stub

	}

	public void interrupt() {
		// TODO Auto-generated method stub

	}

	public boolean isAlive() {
		// TODO Auto-generated method stub
		return false;
	}
}
