package byteBankH;

public class testFuncionario {
public static void main(String[] args) {
	funcionario Diego = new funcionario();
	
	Diego.setDocumento("1234567");
	Diego.setNombre("Diego");
	Diego.setSalario(100.000);
	System.out.println(Diego.getSalario());
	
	System.out.println(Diego.getBonificacion());
	
}
}
