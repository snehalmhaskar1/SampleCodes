package com.dao;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	// JDBC : Java Database Connectivity 
	// Java --driver-- Database

	public class DBConnection {

		public Connection getDBConnection() {
			
			Connection con = null;
			
			try {
				// Step 1 : Load database driver 
				Class.forName("com.mysql.jdbc.Driver");
				
				// Step 2 : Get Connection 
				 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/moviedata","MyDevUser","MyDevUserPwd");
				System.out.println(con.getCatalog());
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			
			return con;
			
		
		
	}

	}
