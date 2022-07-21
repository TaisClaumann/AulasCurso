package br.com.agendamentodentista.core.dao.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
	
	private static final String urlDb = "jdbc:mysql://localhost:3306/agendamento_dentista_db"; 
	private static final String userDb = "root";
	private static final String passDb = "931993"; 
	
	
	private static Connection conn;
	
	public static Connection getConexao() {
		
		try {
			if(conn == null) {			
				conn = DriverManager.getConnection(urlDb, userDb, passDb);
				return conn;
			}else {
				return conn;
			}
		} catch (SQLException e) {			
			e.printStackTrace();
			return null;
		}		
	}
	
	
	
//	public static void main(String[] args) {
//		
//		try {
//			DriverManager.getConnection(urlDb, userDb, passDb);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		
		
		
//	}

}
