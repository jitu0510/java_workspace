package com.revision;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DynamicRead {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		try {
			FileInputStream fileInputStream=new FileInputStream("Dynamic.properties");
			Properties properties=new Properties();
			properties.load(fileInputStream);
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/technoelevate","root","root");
			preparedStatement=conn.prepareStatement(properties.getProperty("2"));
			preparedStatement.setInt(1, 10);
			resultSet=preparedStatement.executeQuery();
			while(resultSet.next())
			{
				System.out.println("Dept No:"+resultSet.getInt(1));
				System.out.println("Department Name: "+resultSet.getString(2));
				System.out.println("Location: "+ resultSet.getString(3));
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
					preparedStatement.close();
					resultSet.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		}

	}


}
