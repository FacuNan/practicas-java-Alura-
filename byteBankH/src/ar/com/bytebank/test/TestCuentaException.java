package ar.com.bytebank.test;
import ar.com.bytebank.modelo.*;
public class TestCuentaException {
	public static void main(String[] args) {
		cuenta Cuenta = new CuentaAhorro(123, 456);
		Cuenta.depositar(200);
		try {
			Cuenta.retirar(300);
		} catch (SaldoInsufucienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
