package byteBankH;

public class funcionario {
	private String nombre;
	private String Documento;
	private double salario;
	private int tipo;

	public funcionario() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return Documento;
	}

	public void setDocumento(String documento) {
		Documento = documento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getBonificacion() {
		if (this.tipo == 1) {
			return this.salario;
		} else if (this.tipo == 0) {
			return this.salario * 0.1;
		} else {
			return 0;
		}

	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}
