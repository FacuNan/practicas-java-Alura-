package practicabtnbank;

public class crearCuenta {
	public static void main(String[] args) {
		cuenta primeraCuenta = new cuenta();
		
		primeraCuenta.setSaldo(1000);
		
		System.out.println(primeraCuenta.getSaldo());
		
		cuenta segundaCuenta = new cuenta();
		segundaCuenta.setSaldo(500);
		
		System.out.println(segundaCuenta.getSaldo());
		
		
		cuenta terceraCuenta = new cuenta();
		terceraCuenta.setSaldo(300);
		
		cuenta cuartaCuenta = terceraCuenta;
		cuartaCuenta.setSaldo(1000);
		
		System.out.println("Susaldo es "
		+ terceraCuenta.getSaldo());
		
		
		
	}

}
