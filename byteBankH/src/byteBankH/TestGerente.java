package byteBankH;

public class TestGerente {
public static void main(String[] args) {
	//Gerente gerente = new Gerente();
	
	funcionario gerente = new funcionario();
	
	gerente.setSalario(6000);
	
	gerente.setNombre("Facundo");
	gerente.setDocumento("12345678");
	System.out.println(gerente.getBonificacion());
	
	gerente.setTipo(1);
}

}
