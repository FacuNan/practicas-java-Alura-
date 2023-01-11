
public class Conexion implements AutoCloseable{
public Conexion() {
	System.out.println("Abriendo Conexion");
	
}

public void LeerConexion() {
	System.out.println("Recibiendo Datos");
	throw new IllegalStateException();
}

public void cerrar() {
	System.out.println("Cerrando conexion");

}

@Override
public void close() throws Exception {
	// TODO Auto-generated method stub
	cerrar();
}


}
