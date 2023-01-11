package com.alura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Alura {
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/stock_productos?useTimeZone=true&serverTimeZone=UTC",
                "root",
                "admin");

        System.out.println("Cerrando la conexión");

        con.close();
	}

}
