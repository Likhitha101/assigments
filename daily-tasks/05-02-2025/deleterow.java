package com.database;
import java.sql.*;
import java.util.Scanner;
public class deleterow {
            public static void main(String[] args) throws SQLException,Exception,ClassNotFoundException {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Employee ID to delete: ");
	        int empId = sc.nextInt();
	        deleteEmployee(empId);
	        sc.close();
	    }
          private static void deleteEmployee(int empId) {
	        try {
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?useSSL=false", "admin", "root");
	            Class.forName("com.mysql.cj.jdbc.Driver");
                String sql = "DELETE FROM employee WHERE empid = ?";
	            PreparedStatement pstmt = con.prepareStatement(sql);
	            pstmt.setInt(1, empId);
	            int rowdeleted = pstmt.executeUpdate();
	            if(rowdeleted>0) {
	            	System.out.println("employee deleted successfully");
	            }
	            else {
	            	System.out.println("No employee found with "+empId);
	            }
                pstmt.close();
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}


