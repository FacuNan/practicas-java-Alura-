package ar.com.bytebank.test;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import ar.com.bytebank.modelo.Cliente;
import ar.com.bytebank.modelo.CuentaAhorro;
import ar.com.bytebank.modelo.CuentaCorriente;
import ar.com.bytebank.modelo.cuenta;

public class TestOrdenarLista {
public static void main(String[] args) {
	cuenta cc1 = new CuentaCorriente(22, 33);
	cc1.depositar(333.0);

	cuenta cc2 = new CuentaAhorro(22, 44);
	cc2.depositar(444.0);

	cuenta cc3 = new CuentaCorriente(22, 11);
	cc3.depositar(111.0);

	cuenta cc4 = new CuentaAhorro(22, 22);
	cc4.depositar(222.0);

	List <cuenta> lista = new ArrayList<>();
	lista.add(cc1);
	lista.add(cc2);
	lista.add(cc3);
	lista.add(cc4);
	System.out.println("Antes del sort");
	for(cuenta Cuenta : lista) {
		System.out.println(Cuenta);
	}
	Comparator <cuenta> comparator = new Opennumero();
	lista.sort(comparator);
	System.out.println("Despues del sort");
	for(cuenta Cuenta : lista) {
		System.out.println(Cuenta);
	}
}

}

class Opennumero implements Comparator <cuenta>{

	@Override
	public int compare(cuenta o1, cuenta o2) {
		if(o1.getNumero() > o2.getNumero()) {
			return 1;
		}else {
			return -1;
		}
		
		
	}
	
}