package com.alura.jdbc.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import connectioFactory.connectionfactory;

public class ProductoController {

	public int modificar(String nombre, String descripcion, Integer cantidad, Integer id) throws SQLException {
		connectionfactory factory = new connectionfactory();
		final Connection con = factory.recuperConexion();
		try (con) {
			final PreparedStatement statement = con.prepareStatement("UPDATE productos SET " + " NOMBRE = ?, "
					+ " DESCRIPCION = ?," + " CANTIDAD = ?" + " WHERE ID = ?");
			try (statement) {
				statement.setString(1, nombre);
				statement.setString(2, descripcion);
				statement.setInt(3, cantidad);
				statement.setInt(4, id);
				statement.execute();

				int updateCount = statement.getUpdateCount();

				return updateCount;
			}
		}
	}


    public int eliminar(Integer id) throws SQLException {
        connectionfactory factory = new connectionfactory();
        final Connection con = factory.recuperConexion();
        
        try(con) {
            final PreparedStatement statement = con
                .prepareStatement("DELETE FROM productos WHERE ID = ?");
            
            try(statement) {
                statement.setInt(1, id);
                statement.execute();
        
                int updateCount = statement.getUpdateCount();
        
                return updateCount;
            }
        }
    }

	public List<Map<String, String>> listar() throws SQLException {
		// TODO
		Connection con = new connectionfactory().recuperConexion();

		Statement statement = con.createStatement();

		statement.execute("SELECT id, nombre, descripcion, cantidad FROM productos");

		ResultSet resultSet = statement.getResultSet();

		List<Map<String, String>> resultado = new ArrayList<>();

		while (resultSet.next()) {
			resultSet.getInt("id");
			Map<String, String> fila = new HashMap<String, String>();

			fila.put("id", String.valueOf(resultSet.getInt("id")));
			fila.put("nombre", resultSet.getString("nombre"));
			fila.put("descripcion", resultSet.getString("descripcion"));
			fila.put("cantidad", String.valueOf(resultSet.getInt("cantidad")));

			resultado.add(fila);
		}

		con.close();

		return resultado;
	}

	public void guardar(Map<String, String> producto) throws SQLException {
		connectionfactory factory = new connectionfactory();
		final Connection con = factory.recuperConexion();
		try (con) {
			con.setAutoCommit(false);

			final PreparedStatement statement = con.prepareStatement(
					"INSERT INTO productos (nombre, descripcion, cantidad)" + " values(?, ? , ?) ",
					Statement.RETURN_GENERATED_KEYS);
			String nombre = producto.get("NOMBRE");
			String descripcion = producto.get("DESCRIPCION");
			Integer cantidad = Integer.valueOf(producto.get("CANTIDAD"));
			Integer cantidadMaxima = 50;

			try (statement) {

				do {
					int cantidadGuardar = Math.min(cantidad, cantidadMaxima);
					ejecutaRegistro(nombre, descripcion, cantidadGuardar, statement);
					cantidad -= cantidadMaxima;
				} while (cantidad > 0);
				con.commit();
				System.out.println("COMMIT");

			} catch (Exception e) {
				con.rollback();
				System.out.println("ROLLBACK");
			}

		}

	}

	private void ejecutaRegistro(String nombre, String descripcion, Integer cantidad, PreparedStatement statement)
			throws SQLException {
		if (cantidad > 50) {
			throw new RuntimeException("Ocurrio un error");
		}

		statement.setString(1, nombre);
		statement.setString(2, descripcion);
		statement.setInt(3, cantidad);

		statement.execute();

		final ResultSet resultSet = statement.getGeneratedKeys();
		try (resultSet) {
			while (resultSet.next()) {
				System.out.println(String.format("Fue insertado el producto de ID: %d", resultSet.getInt(1)));
			}

		}

	}
}
