package com.revision;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Dept. Number:");
		int deptno=sc.nextInt();
		
		System.out.println("Enter Location:");
		String loc=sc.next();
		
		Connection conn=null;
		PreparedStatement preparedStatement=null;
		
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/technoelevate","root","root");
			preparedStatement=conn.prepareStatement("update dept set loc=? where deptno=?");
			preparedStatement.setInt(2, deptno);
			
			preparedStatement.setString(1, loc);
			preparedStatement.execute();
			System.out.println("Successfully Inserted");
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
					preparedStatement.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		}
		
		

	}

}
