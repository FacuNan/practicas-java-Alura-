package ar.com.bytebank.test;
import ar.com.bytebank.modelo.*;
public class testReferencia {
public static void main(String[] args) {
	funcionario Funcionario = new Gerente();
	
	Funcionario.setNombre("Diego");

	Gerente gerente = new Gerente();
	gerente.setNombre("Jimena");
	
	
	Funcionario.setSalario(10000);
	gerente.setSalario(20000);
}
}
