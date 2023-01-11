package com.alura.jdbc.pruebas;

import java.sql.Connection;
import java.sql.SQLException;

import connectioFactory.connectionfactory;

public class PruebaDataBase {
	public static void main(String[] args) throws SQLException {
		connectionfactory factory = new connectionfactory();
		
		for(int i = 0; i < 20; i++) {
			Connection conexion = factory.recuperConexion();
			
			System.out.println("Abriendo la conexion numero "+ (i + 1));
			
		}
	}

}
