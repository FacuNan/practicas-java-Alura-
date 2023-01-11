package practicasAula;

import java.util.HashSet;
import java.util.Set;

public class Aloumno {
	public static void main(String[] args) {
		String alumno1 = "Facundo Comercio";
		String alumno2 = "Jorge Rojas";
		String alumno3 = "Luca Prodan";

		Set<String> listaAlumnos = new HashSet<>();

		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);

		for (String alumno : listaAlumnos) {
			System.out.println(alumno);
		}

		listaAlumnos.forEach(alumno -> System.out.println(alumno));

	}

}
