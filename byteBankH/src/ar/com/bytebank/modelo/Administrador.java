package ar.com.bytebank.modelo;

public class Administrador extends funcionario implements Autenticable {
private AutenticacionUtil util;

public Administrador() {
	this.util = new AutenticacionUtil();
}

	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setClave(String Clave) {
		this.util.setClave(Clave);
	}

	@Override
	public boolean iniciarSesion(String clave) {
	return this.util.iniciarSesion(clave);
	}

}
