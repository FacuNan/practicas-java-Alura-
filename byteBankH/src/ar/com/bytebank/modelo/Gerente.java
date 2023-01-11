package ar.com.bytebank.modelo;

public class Gerente extends funcionario implements Autenticable{

	


public double getBonificacion() {
	return 2000;

}

@Override
public void setClave(String Clave) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean iniciarSesion(String clave) {
	// TODO Auto-generated method stub
	return false;
}
}