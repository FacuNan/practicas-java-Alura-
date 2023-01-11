package com.alura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class aluraTest {
	  public static void main(String[] args) throws SQLException {
	        Connection con = DriverManager.getConnection(
	                "jdbc:mysql://localhost/stock_productos?useTimeZone=true&serverTimeZone=UTC",
	                "root",
	                "root1234");

	        System.out.println("Cerrando la conexión");

	        con.close();
	    }
}

