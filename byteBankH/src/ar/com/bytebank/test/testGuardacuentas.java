package ar.com.bytebank.test;

import ar.com.bytebank.modelo.CuentaAhorro;
import ar.com.bytebank.modelo.CuentaCorriente;
import ar.com.bytebank.modelo.cuenta;
import ar.com.bytebank.modelo.guardaCuentas;

public class testGuardacuentas {
	public static void main(String[] args) {

		guardaCuentas guardar = new guardaCuentas();
		cuenta cc1 = new CuentaCorriente(100, 200);
		guardar.adicionar(cc1);
		cuenta cc2 = new CuentaAhorro(200, 100);
		guardar.adicionar(cc2);
		
		guardar.obtener(1);
		System.out.println(guardar.obtener(0));
		System.out.println(guardar.obtener(1));
	}
}
