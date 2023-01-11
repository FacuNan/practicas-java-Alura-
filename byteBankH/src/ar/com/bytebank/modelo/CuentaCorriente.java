package ar.com.bytebank.modelo;

public class CuentaCorriente extends cuenta {
	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);

	}

	@Override
	public void retirar(double valor) throws SaldoInsufucienteException {
		double comision = 0.2;
		super.retirar(valor + comision);
	}

	@Override
	public void depositar(double Saldo) {
		// TODO Auto-generated method stub
		this.Saldo += Saldo;
	}

}
