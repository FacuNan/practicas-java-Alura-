package ar.com.bytebank.test;

import java.util.ArrayList;


import ar.com.bytebank.modelo.CuentaCorriente;
import ar.com.bytebank.modelo.cuenta;

public class TestArayUtil {
	public static void main(String[] args) {
		ArrayList<cuenta> lista = new ArrayList<>();
		
		CuentaCorriente cc =new  CuentaCorriente(100,200);
		CuentaCorriente c2 = new CuentaCorriente(200,200);
		CuentaCorriente c3 = new CuentaCorriente(200,200);
		
		lista.add(cc);
		lista.add(c2);
		
		
		//Obtener elemento de Array List
		
		cuenta obtenerCuenta = (cuenta)lista.get(1);
		
		//System.out.println(obtenerCuenta);
		
		
		for(int i = 0; i < lista.size(); i++ ) {
			System.out.println(lista.get(i));
		}
		
		for (cuenta Cuenta : lista) {
			System.out.println(Cuenta);
		}
		
		boolean contiene = lista.contains(c3);
		
		if(contiene) {
			System.out.println("si");
		}else {
			System.out.println("no");
		}
	}

}
