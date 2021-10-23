package com.revision;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Dept. Number:");
		int deptno=sc.nextInt();
		Connection conn=null;
		PreparedStatement preparedStatement=null;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/technoelevate","root","root");
			preparedStatement=conn.prepareStatement("select * from dept where deptno=?");
			preparedStatement.setInt(1, deptno);
			ResultSet resultSet= preparedStatement.executeQuery();
			while(resultSet.next())
			{
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
			}
	} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
