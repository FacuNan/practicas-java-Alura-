
public class Flujo {
	public static void main(String[] args) {
		System.out.println("Inicio main");
		try {
			metodo1();
		} catch (MeException ne) {
			ne.printStackTrace();
		}
		System.out.println("fin main");
	}

	private static void metodo1() throws MeException {
		System.out.println("Inicio metodo 1");
		metodo2();

		System.out.println("Fin de metodo 1");

	}

	private static void metodo2() throws MeException {
		System.out.println("Inicio metodo 2");

		throw new MeException("Mi excepcion fue lanzada");

	}
}
