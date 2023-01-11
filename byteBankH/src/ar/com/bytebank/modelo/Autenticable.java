package ar.com.bytebank.modelo;

public interface Autenticable {

	public void setClave(String Clave);
	public boolean iniciarSesion(String clave);

	
}
