package com.revision;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;



public class PropertiesStaticSql {
	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		try {
			FileInputStream fileInputStream=new FileInputStream("Static.properties");
			Properties properties=new Properties();
			properties.load(fileInputStream);
			//System.out.println(properties.getProperty("1"));
			//Prepared Statement
			Class.forName("com.mysql.jdbc.Driver");
			String drul="jdbc:mysql://localhost:3306/technoelevate";
			connection=DriverManager.getConnection(drul, "root", "root");
			statement=connection.createStatement();
			statement.executeUpdate(properties.getProperty("1"));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
