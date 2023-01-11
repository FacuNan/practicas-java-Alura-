package ar.com.bytebank.test;
import ar.com.bytebank.modelo.*;
public class TestGerente {
public static void main(String[] args) {
	//Gerente gerente = new Gerente();
	Gerente  gerente = new Gerente();
	
	gerente.setSalario(6000);
	
	gerente.setNombre("Facundo");
	gerente.setDocumento("12345678");
	gerente.setClave("AluraCursos2022");
	System.out.println(gerente.getBonificacion());
	
	gerente.setTipo(1);
	
	System.out.println(gerente.iniciarSesion("AluraCursos2022"));
}

}
