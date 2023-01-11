package ar.com.bytebank.modelo;

public class Cliente implements Autenticable{
	
	private String dni;
	private String telefono;
	private String sexo;
	private String Titular;
	private String nombre;

	
	private AutenticacionUtil util;
	
	public Cliente() {
		this.util = new AutenticacionUtil();
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getTitular() {
		return Titular;
	}
	public void setTitular(String titular) {
		Titular = titular;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public void setClave(String Clave) {
		this.setClave(Clave);
		
	}
	@Override
	public boolean iniciarSesion(String clave) {
	return this.util.iniciarSesion(clave);
		
	}

}
