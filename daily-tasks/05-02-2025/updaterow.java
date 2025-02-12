package com.database;
import java.sql.*;
import java.util.Scanner;
public class updaterow {
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?useSSL=false", "admin", "root");
                String sql = "UPDATE employee SET empname = ?, sal = ? WHERE empid = ?";
	            PreparedStatement pstmt = con.prepareStatement(sql);
                System.out.print("Enter Employee ID to update: ");
	            int empid = sc.nextInt();
	            sc.nextLine(); 
	            System.out.print("Enter new Employee Name: ");
	            String empname = sc.nextLine();
	            System.out.print("Enter new Employee Salary: ");
	            int sal = sc.nextInt();
	            pstmt.setString(1, empname);
	            pstmt.setInt(2, sal);
	            pstmt.setInt(3, empid);
	            int rowsUpdated = pstmt.executeUpdate();
	            if (rowsUpdated > 0) {
	                System.out.println("Employee details updated successfully!");
	            } else {
	                System.out.println("No employee found with ID " + empid);
	            }
	            pstmt.close();
	            con.close();
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        } finally {
	            sc.close(); 
	        }
	    }
	}
