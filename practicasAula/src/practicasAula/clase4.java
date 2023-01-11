package practicasAula;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.Curso;

public class clase4 {
	public static void main(String[] args) {
		Curso curso1 = new Curso("Geometria", 30);
		Curso curso2 = new Curso ("Matematicas", 10);
		Curso curso3 = new Curso("Lengua", 32);
		Curso curso4 = new Curso("Historia", 22);
		Curso curso5 = new Curso("Ingles", 55);

		ArrayList<Curso> cursos = new ArrayList<>();

		
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
		
		List<Curso> cursosList = cursos.stream().sorted().collect(Collectors.toList());
		System.out.println(cursosList);
	}


}
