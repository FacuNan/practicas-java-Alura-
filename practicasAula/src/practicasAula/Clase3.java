package practicasAula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Clase3 {
	public static void main(String[] args) {
		String curso1 = "Geometria";
		String curso2 = "Matematicas";
		String curso3 = "Lengua";
		String curso4 = "Historia";
		String curso5 = "Ingles";

		ArrayList<String> cursos = new ArrayList<>();

		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		cursos.add(curso5);
		//System.out.println(cursos);
		//Collections.sort(cursos);
		//System.out.println(cursos);
		
		/**Collections.sort(cursos, Collections.reverseOrder());
		System.out.println(cursos);
		// Formas de leer un array

		/**
		 * for (int i = 0; i < listaString.size(); i++) {
		 * System.out.println(listaString.get(i)); }
		 **/

		/**
		 * for(String clase: listaString) { System.out.println(clase); }
		 **/

		// for con lambdas
		/**cursos.forEach(clase -> {
			System.out.println(clase);
		});**/
		
		List<String> cursosList = cursos.stream().sorted().collect(Collectors.toList());
		System.out.println(cursosList);

	}
}
