package ar.com.bytebank.modelo;

public class guardaCuentas {

	Object[] referencias = new Object[10];
	int indice = 0;

	public void adicionar(cuenta cc1) {
		referencias[indice] = cc1;
		indice++;

	}
	
	public Object obtener(int indice) {
		return referencias[indice];
	}

}
