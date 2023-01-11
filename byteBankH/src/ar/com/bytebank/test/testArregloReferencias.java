package ar.com.bytebank.test;

import ar.com.bytebank.modelo.CuentaAhorro;
import ar.com.bytebank.modelo.CuentaCorriente;
import ar.com.bytebank.modelo.cuenta;

public class testArregloReferencias {
public static void main(String[] args) {
	
	CuentaCorriente cc = new CuentaCorriente(200, 100);
	
	
	
	 Object[] referencia = new Object[5];
	referencia[1]= cc;

	referencia[0] = new CuentaCorriente(11,200);
	
	referencia[3] = new CuentaAhorro(200, 56);
	
	//casteo//
	CuentaCorriente cuenta= (CuentaCorriente)referencia[1];
	
	System.out.println(referencia[0]);
	

	
	
	for(int i = 0; i < referencia.length; i++) {
		System.out.println(referencia[i]);
	}
}
}
