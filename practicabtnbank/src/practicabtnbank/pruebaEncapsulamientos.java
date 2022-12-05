package practicabtnbank;

public class pruebaEncapsulamientos {
public static void main(String[] args) {

	cuenta Cuenta = new cuenta();
	
	Cliente cliente = new Cliente();
	
	cliente.setNombre("Facundo");
	cliente.setDni("12345678"); 
	
	Cuenta.setTitular(cliente);
		
}
}