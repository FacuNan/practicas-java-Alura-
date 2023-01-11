/**
 * @author Facundo
 * @version 1.0
 * Cuenta va a crear nuevas instancias de cuenta
 */

package ar.com.bytebank.modelo;

public abstract class cuenta {
	protected double Saldo;
	private int Agencia;
	private int Numero;
	 Cliente titular= new Cliente();
	private static int total = 0;
	
	public static void setTotal(int total) {
		cuenta.total = total;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String cuenta = "Numero: " + this.Numero + ", Agencia: " + this.Agencia;
		return cuenta;
	}

	
	 
	 public cuenta(int agencia, int numero) {
		
		 this.Agencia= agencia;
		 this.Numero=numero;
		 System.out.println("Estoy creando una cuenta" + this.Numero);
		 cuenta.total++;
		
	 }

	public abstract void depositar(double Saldo);
/**
 * Este metoido retira dinero de la cuenta
 * Si ocurre un error lanza una excepciondoc
 * @param valor
 * @throws SaldoInsufucienteException
 */
	public void retirar(double valor) throws SaldoInsufucienteException{
		if (this.Saldo >= valor) {
		throw new SaldoInsufucienteException("Saldo insuficiente");
		}
		
		this.Saldo  -= valor;

	}

	public boolean transferir(double valor, cuenta Cuenta) {
		if (this.Saldo >= valor) {
			try {
				this.retirar(valor);
			} catch (SaldoInsufucienteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Cuenta.depositar(valor);
			return true;

		} else {
			return false;
		}
	}

	public double getSaldo() {
		return this.Saldo;
	}
	
	public void setSaldo(double saldo) {
		this.Saldo = saldo;
	}

	public void setAgencia(int nuevaAgencia) {
		if (nuevaAgencia > 0) {
			this.Agencia = nuevaAgencia;
		}else {
			System.out.println("No puede ingresar valores negativos");
		}
	}
	
	public int getAgencia() {
		return this.Agencia;
	}
	
	public int getNumero() {
		return this.Numero;
	}

	

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {
		return total;
	}
	
	public boolean sonIguales(cuenta Cuenta) {
		return this.Agencia == Cuenta.getAgencia()&&
				this.Numero == Cuenta.getNumero();
	}
	@Override
	public boolean equals(Object obj) {
		cuenta Cuenta = (cuenta)obj;
		return this.Agencia == Cuenta.getAgencia()&&
				this.Numero == Cuenta.getNumero();
		
	}
	
	

}
