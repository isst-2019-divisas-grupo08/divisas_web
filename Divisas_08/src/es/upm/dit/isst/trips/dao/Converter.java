package es.upm.dit.isst.trips.dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.hibernate.Session;


import es.upm.dit.isst.trips.model.Monedero.SYMBOLS;


public class Converter{
	
	private static Converter instance;
	private Converter() {};
	public static Converter getInstance() {
		if(null == instance) {
			instance = new Converter();
		}
		return instance;
	}
	
	public static double createCambio(double divisaOrig, double divisaDest, SYMBOLS orig, SYMBOLS dest) {


		try {
	            //Yahoo Finance API
	            URL url = new URL("http://finance.yahoo.com/d/quotes.csv?f=l1&s="+ orig + dest + "=X");
	            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
	            String line = reader.readLine();
	            if (line.length() > 0) {
	               
	            	 divisaDest = Double.parseDouble(line) * divisaOrig;
	            	 return divisaDest;
	            }
	            reader.close();
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	        return 0;
	    }
}