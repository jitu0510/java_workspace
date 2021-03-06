package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class Student {

	User u;
	Connection conn=null;
	public Student()
	{
		
	}
	public Student(User u) {
		this.u=u;
	}
	
   //Insertion
	public void insertUser(String email,double marks,String name,String grade)
	{
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			
			try {
				PreparedStatement ps=conn.prepareStatement("insert into details (email,marks,name,grade) values(?,?,?,?)");
				//ps.setInt(1, id);
				ps.setString(1, email);
				ps.setDouble(2, marks);
				ps.setString(3, name);
				ps.setString(4, grade);
				ps.executeUpdate();
				System.out.println("Data Updated Successfully....!!!");
			}
			catch(SQLException e)
			{
				
				System.out.println("Data not Updated...!!!");
			}
		} catch (SQLException e) {
			System.out.println("Some Problem Occured..!!!");
		}
	}
	
	//Search Student
	public void searchStudent(int id)
	{
		PreparedStatement ps=null;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			try {
				
				ps=conn.prepareStatement("select * from details where id=?");
				ps.setInt(1, id);
				
				ResultSet rs=ps.executeQuery();	
				int count=0;
				while(rs.next()) {
					count++;
					System.out.println("Id: "+rs.getInt(1));
					System.out.println("Name: "+rs.getString(4));
					System.out.println("Email: "+rs.getString(2));
					System.out.println("Marks: "+rs.getDouble(3));
					System.out.println("Grade: "+rs.getString(5));
				}
				if(count==0)
				{
					System.out.println("Student ID doesn't exist");
				}
					
					
				
			} catch (SQLException e) {
				
				System.out.println("Some Problem Occured....!!!");
			}
			
		} catch (SQLException e) {
			System.out.println("Some Problem Occured...!!!");
		}
	}
	
	//Delete Student
	public void deleteStudent(int id)
	{
		PreparedStatement ps=null;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			try {
				ps=conn.prepareStatement("select * from details where id=?");
				ps.setInt(1, id);
				ResultSet rs=ps.executeQuery();
				try {
				if((rs.next())==false)
					throw new SQLException();
				ps=conn.prepareStatement("delete from details where id=?");
				ps.setInt(1, id);
				ps.execute();
				}catch(SQLException e)
				{
					System.out.println("Student Details doesn't exist...!!!");
				}
				
			} catch (SQLException e) {
				
				System.out.println("Not Deleted....!!!");
			}
		} catch(SQLException e) {
			System.out.println("Try After Sometime....!!!");
		}
	}
	
	//update email
	
	public void updateEmail(int id,String email)
	{
		PreparedStatement ps=null;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			try {
				ps=conn.prepareStatement("update details set email=? where id=?");
				ps.setString(1, email);
				ps.setInt(2, id);
				ps.executeUpdate();
				System.out.println("Email Updated updated Successfully...!!!");
				
			} catch (SQLException e) {
				
				System.out.println("Not Updated....!!!");
			}
		} catch (SQLException e) {
			
			System.out.println("Try After Sometime....!!!");
		}
		
	}
	
	//printmarks
	
	public void printMarks(int id)
	{
		PreparedStatement ps=null;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			try {
				ps=conn.prepareStatement("select marks from details where id=?");
				
				ps.setInt(1, id);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					
					System.out.println("Marks: "+rs.getDouble(1));
					
				}
				
			} catch (SQLException e) {
				
				System.out.println("Not Updated....!!!");
			}
		} catch (SQLException e) {
			
			System.out.println("Try After Sometime....!!!");
		}
		
	}
	
	//print grade
	public void printGrade(int id) {
		PreparedStatement ps=null;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			try {
				ps=conn.prepareStatement("select Grade from details where id=?");
				
				ps.setInt(1, id);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					
					System.out.println("Grade: "+rs.getString(1));
					
				}
				
			}catch (SQLException e){
				
				System.out.println("Some Problem Occured...!!!");
			}
		} catch (SQLException e) {
			
			System.out.println("Try After Sometime....!!!");
		}
	}
	
	
	
	
}
