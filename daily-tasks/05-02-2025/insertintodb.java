package com.database;
import java.sql.*;
public class insertintodb {
	public static final String url="jdbc:mysql://localhost:3306/techm?useSSL=false";
public static void main(String args[])throws SQLException,Exception,ClassNotFoundException {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,"admin","root");
		Statement stmt=con.createStatement();
		int result=stmt.executeUpdate("insert into employee(empid,empname,sal) values(102,'geetha',20000)");
		if(result>0) {
			System.out.println("row inserted");
			
		}
		else {
			System.out.println("didnt insert row");
		}
	}
	catch(SQLException sq){
		System.out.println(sq);
		
	}
}
}
