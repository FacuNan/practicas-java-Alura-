package byteBankH;

public class Gerente extends funcionario{

	
private String clave;
public void setClave(String Clave) {
	this.clave= Clave;
}

public boolean iniciarSesion(String clave) {
	return clave=="AluraCursos2022";
}

}
