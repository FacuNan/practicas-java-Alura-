package ar.com.bytebank.test;
import ar.com.bytebank.modelo.funcionario;
import ar.com.bytebank.modelo.contador;
import ar.com.bytebank.modelo.Gerente;
import ar.com.bytebank.modelo.controlBonificacion;
public class testControlBonificacion {
public static void main(String[] args) {
	funcionario Diego = new contador();
Diego.setSalario(2000);

Gerente Jimena = new Gerente();
Jimena.setSalario(10000);

contador Alexis = new contador();
Alexis.setSalario(5000);

controlBonificacion ControlBonificacion = new controlBonificacion();

ControlBonificacion.registrarSalario(Diego);
ControlBonificacion.registrarSalario(Jimena);
ControlBonificacion.registrarSalario(Alexis);


}
}
