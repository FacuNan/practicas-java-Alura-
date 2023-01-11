package practicabtnbank;

class cuenta {
	private double Saldo;
	private int Agencia;
	private int Numero;
	 Cliente titular;
	private static int total = 0;
	
	public static void setTotal(int total) {
		cuenta.total = total;
	}

	public cuenta() {
		 
	 }
	 
	 public cuenta(int agencia) {
		
		 if(agencia <=0) {
			 System.out.println("No se permiten numeros menores o iguales a 0");
			 this.Agencia= 1;
		 }else {
			 this.Agencia=agencia;
		 }
		 
		 total++;
		 System.out.println("Hay un total de "+ total + " cuentas");
	 }

	public void depositar(double Saldo) {
		this.Saldo += Saldo;
	}

	public void retirar(double valor) {
		if (this.Saldo >= valor) {
		throw new SaldoInsufucienteException("No es posible retirar saldo");
		} 
			
		this.Saldo -= valor;

	}

	public boolean transferir(double valor, cuenta Cuenta) {
		if (this.Saldo >= valor) {
			this.retirar(valor);
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

	

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {
		return total;
	}
	
	

}
