package ar.com.bytebank.modelo;

public class controlBonificacion {
	private double suma;

	public double registrarSalario(funcionario Funcionario) {
		this.suma = Funcionario.getBonificacion() + this.suma;
		System.out.println(this.suma);
		return this.suma;
	}
	
	
	public double registrarSalario(Gerente gerente) {
		this.suma = gerente.getBonificacion() + this.suma;
		System.out.println(this.suma);
		return this.suma;
	}
	
	public double registrarSalario(contador Contador) {
		this.suma = Contador.getBonificacion() + this.suma;
		System.out.println(this.suma);
		return this.suma;
	}
}
