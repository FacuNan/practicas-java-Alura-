package practicasAula;

import java.util.ArrayList;


public class clase2 {
	public static void main(String[] args) {
		String variable = "clase1";
		String variable2 = "clase2";

		ArrayList<String> listaString = new ArrayList<>();
		

		listaString.add(variable);
		listaString.add(variable2);
		System.out.println(listaString);

		// Formas de leer un array

		/**for (int i = 0; i < listaString.size(); i++) {
			System.out.println(listaString.get(i));
		}**/
		
		/**for(String clase: listaString) {
			System.out.println(clase);
		}**/
		
		
		//for con lambdas
		listaString.forEach(clase ->{
			System.out.println(clase);
		});

	}
}
