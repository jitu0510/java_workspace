package com.revision;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class DynamicUpdate {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement preparedStatement=null;
		Scanner scanner=new Scanner(System.in);
		try {
				FileInputStream fileInputStream=new FileInputStream("Dynamic.properties");
				Properties properties=new Properties();
				properties.load(fileInputStream);
				Class.forName("com.mysql.jdbc.Driver");
				String dbUrl="jdbc:mysql://localhost:3306/"+
				"technoelevate?user=root&password=root";
				conn= DriverManager.getConnection(dbUrl);
				preparedStatement=conn.prepareStatement(properties.getProperty("3"));
			
				System.out.println("enter deptno");
				int deptno=scanner.nextInt();
				System.out.println("enter location");
				String loc=scanner.next();
				preparedStatement.setString(1,loc );
				preparedStatement.setInt(2, deptno);
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
