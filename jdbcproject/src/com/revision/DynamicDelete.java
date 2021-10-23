package com.revision;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class DynamicDelete {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement preparedStatement=null;
		try {
				FileInputStream fileInputStream=new FileInputStream("Dynamic.properties");
				Properties properties=new Properties();
				properties.load(fileInputStream);
				Class.forName("com.mysql.jdbc.Driver");
				String dbUrl="jdbc:mysql://localhost:3306/"+
				"technoelevate?user=root&password=root";
				conn= DriverManager.getConnection(dbUrl);
				preparedStatement=conn.prepareStatement(properties.getProperty("4"));
				preparedStatement.setInt(1, 22);
				
				preparedStatement.execute();
				
				//int result=statement.executeUpdate("update dept set loc='Bangalore' where deptno=11");
//				int result=preparedStatement.executeUpdate(properties.getProperty("3"));
				//System.out.println(result);
		} catch (Exception e) {
			System.out.println("Some Problem Occured");
		}finally {
			
			try {
				if(conn!=null){
				conn.close();
				preparedStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}


}
