
public class Testconexion {
public static void main(String[] args) throws Exception {
	/*Conexion conexion = null;
	try {
		conexion= new Conexion();
		conexion.LeerConexion();
	}catch( IllegalStateException ae) {
		
		ae.printStackTrace();
	}finally {
		System.out.println("Ejecutando finally");
		if(conexion != null) {
			conexion.cerrar();
		}
	}*/
	try(Conexion con = new Conexion()){
		
		con.LeerConexion();
		
	}catch(IllegalStateException ae) {
		System.out.println("Ejecutando Catch");
		ae.printStackTrace();
	}

}
}
