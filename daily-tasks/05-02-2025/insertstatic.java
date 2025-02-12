package com.database;
import java.sql.*;
import java.util.Scanner;
public class insertdyn {
public static void main(String args[])throws SQLException,Exception,ClassNotFoundException {  
int empid;
String empname;
int sal;
Scanner sc=new Scanner(System.in);
System.out.println("enter employee id:");
empid=sc.nextInt();
System.out.println("enter employee name:");
empname=sc.next();
System.out.println("enter employee salary:");
sal=sc.nextInt();
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?useSSL=false","admin","root");
	Statement stmt=con.createStatement();
	String sql="INSERT INTO employee(empid,empname,sal) VALUES(?,?,?)";
	stmt.executeUpdate(sql);
	con.close();
	}
catch(SQLException sq){
	System.out.println(sq);
	
}
}
}