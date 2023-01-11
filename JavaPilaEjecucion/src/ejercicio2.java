
public class ejercicio2 {
	public class Principal {

	    public static void main(String[] args) {

	        String nombre = "Alura"; System.out.println("ANTES");

	        try { 
	            System.out.println(nombre);
	        } catch(ArrayIndexOutOfBoundsException ex) { 
	            System.out.println("CATCH");
	        }

	        System.out.println("DESPUES"); 
	    }

	} 

}
