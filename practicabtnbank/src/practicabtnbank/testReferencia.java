package practicabtnbank;

public class testReferencia {
	public static void main(String[] args) {

		// Se instancio un nuevo cliente
		Cliente Facundo = new Cliente();

		Facundo.setNombre("Facundo");
		Facundo.setDni("1234567");
		Facundo.setTelefono("1234567");;

		// Se instancia una nueva cuenta
		cuenta cuentaDeFacundo = new cuenta();

		cuentaDeFacundo.setAgencia(1);
		cuentaDeFacundo.titular = Facundo;

		System.out.println(cuentaDeFacundo.titular.getDni());

	}
}
