package com.revision;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class P1 {
	public static void main(String[] args) {
		Connection conn=null;
		Statement statement=null;
		try {
				FileInputStream fileInputStream=new FileInputStream("Static.properties");
				Properties properties=new Properties();
				properties.load(fileInputStream);
				Class.forName("com.mysql.jdbc.Driver");
				String dbUrl="jdbc:mysql://localhost:3306/"+
				"technoelevate?user=root&password=root";
				conn= DriverManager.getConnection(dbUrl);
				statement=conn.createStatement();
				//int result=statement.executeUpdate("update dept set loc='Bangalore' where deptno=11");
				int result=statement.executeUpdate(properties.getProperty("3"));
				System.out.println(result);
		} catch (Exception e) {
			System.out.println("Some Problem Occured");
		}finally {
			
			try {
				if(conn!=null){
				conn.close();
				statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}

}
