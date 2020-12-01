package com.personnel.persistance;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
	public static Connection getconnection() {
		Connection connection = null;
		String url="jdbc:mysql://localhost:3306/projet_java?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
		
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection(url,"root","root");
			System.out.println("connecté");
		} catch (Exception exp) {
			
			System.out.println(exp);
		}
		return connection;
	}
	}
