package ar.com.bytebank.modelo;

public class SaldoInsufucienteException extends Exception {

	public SaldoInsufucienteException(String mensaje) {
		super(mensaje);
	}
}
