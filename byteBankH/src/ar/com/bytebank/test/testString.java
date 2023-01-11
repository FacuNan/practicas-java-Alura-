package ar.com.bytebank.test;

import ar.com.bytebank.modelo.CuentaAhorro;

public class testString {

	public static void main(String[] args) {

		String nombre = ("Alura");
		nombre = nombre.replace("A", "a");
		nombre = nombre.concat(" cursos online");
		nombre = nombre.toUpperCase();
		prinLine("Valor despues de replace " + nombre);
		prinLine(new CuentaAhorro(200, 200));
	}

	public static void prinLine(Object valor) {
		System.out.println(valor.toString());
	}
}
