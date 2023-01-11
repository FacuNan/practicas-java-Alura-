package connectioFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class connectionfactory {
	private DataSource datasource;
	
	public connectionfactory() {
		
		var pooledDataSource= new ComboPooledDataSource();
		pooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3307/stock_productos?useTimeZone=true&serverTimeZone=UTC");
		pooledDataSource.setUser("root");
		pooledDataSource.setPassword("admin");
		pooledDataSource.setMaxPoolSize(10);
		this.datasource = pooledDataSource;
		
	}
	
	
	public Connection recuperConexion() throws SQLException {
		return  this.datasource.getConnection();
		
	}

}
