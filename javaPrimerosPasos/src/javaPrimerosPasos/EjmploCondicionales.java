package javaPrimerosPasos;

public class EjmploCondicionales {

	public static void main(String[] args) {
		System.out.println("Hello Word");

		int edad = 11;
		int cantidad = 2;

		if (edad > 18) {
			System.out.println("Su edad es " + edad + " usted puede entrar");
		} else {
			if (cantidad > 1) {
				System.out.println("Usted es menor de edad" + " pero esta permitido su ingreso");
			} else {
				System.out.println("Usted es menor de edad");
			}

		}

	}
}
