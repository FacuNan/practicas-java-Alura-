package com.alura.jdbc.pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import connectioFactory.connectionfactory;

public class PruebaConexion {

    public static void main(String[] args) throws SQLException {
        Connection con = new connectionfactory().recuperConexion();

        System.out.println("Cerrando la conexión");

        con.close();
    }

}
