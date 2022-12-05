package practicabtnbank;

public class pruebaAcceso {
	public static void main(String[] args) {
		cuenta Cuenta = new cuenta();
		Cuenta.setAgencia(22);
		
		//Cuenta.Saldo=200;
		Cuenta.depositar(400);
		
		Cuenta.retirar(300);
		
		
		System.out.println(Cuenta.getSaldo());
		System.out.println(Cuenta.getAgencia());
	}

}
