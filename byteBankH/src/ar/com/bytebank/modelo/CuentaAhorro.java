package ar.com.bytebank.modelo;

public class CuentaAhorro extends cuenta {

	public CuentaAhorro(int agencia, int numero) {
		super(agencia, numero);
		
	}

	@Override
	public void depositar(double Saldo) {
		this.Saldo += Saldo;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
