package javaPrimerosPasos;

public class EjemploCondicionales2 {
	public static void main(String[] args) {
		int edad = 11;
		int cantidadPersonas = 2;
		boolean esPareja = cantidadPersonas >=1 ;
		boolean puedeEntrar = edad >=18 || esPareja;

		if (puedeEntrar) {
			System.out.println("Su edad es " + edad + " usted puede entrar");
		} else {
				System.out.println("Usted es menor de edad");
			}

		}
	}

