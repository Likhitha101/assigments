package com.database;
import java.sql.*;
import java.util.Scanner;
public class menudriven {
            public static void insertrow(Scanner sc) throws SQLException {
	        System.out.println("Enter Employee ID: ");
	        int empid = sc.nextInt();
	        System.out.println("Enter Employee Name: ");
	        String empname = sc.next();
	        System.out.println("Enter Employee Salary: ");
	        int sal = sc.nextInt();

	        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?useSSL=false","admin", "root")){
	            String sql = "INSERT INTO employee (empid, empname, sal) VALUES (?, ?, ?)";
	            PreparedStatement pstmt = con.prepareStatement(sql);
	            pstmt.setInt(1, empid);
	            pstmt.setString(2, empname);
	            pstmt.setInt(3, sal);

	            int rowsInserted = pstmt.executeUpdate();
	            if (rowsInserted > 0) {
	                System.out.println("Employee added successfully!");
	            }
	        }
	    }
	    public static void updaterow(Scanner sc) throws SQLException {
	        System.out.println("Enter Employee ID to update: ");
	        int empid = sc.nextInt();
	        sc.nextLine(); 
            System.out.println("Enter new Employee Name: ");
	        String empname = sc.nextLine();
            System.out.println("Enter new Employee Salary: ");
	        int sal = sc.nextInt();
	        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?useSSL=false","admin", "root")) {
	            String sql = "UPDATE employee SET empname = ?, sal = ? WHERE empid = ?";
	            PreparedStatement pstmt = con.prepareStatement(sql);
	            pstmt.setString(1, empname);
	            pstmt.setInt(2, sal);
	            pstmt.setInt(3, empid);

	            int rowsUpdated = pstmt.executeUpdate();
	            if (rowsUpdated > 0) {
	                System.out.println("Employee details updated successfully!");
	            } else {
	                System.out.println("No employee found with ID " + empid);
	            }
	        }
	    }
	    public static void deleterow(Scanner sc) throws SQLException {
	        System.out.println("Enter Employee ID to delete: ");
	        int empid = sc.nextInt();

	        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?useSSL=false","admin", "root")) {
	            String sql = "DELETE FROM employee WHERE empid = ?";
	            PreparedStatement pstmt = con.prepareStatement(sql);
	            pstmt.setInt(1, empid);

	            int rowsDeleted = pstmt.executeUpdate();
	            if (rowsDeleted > 0) {
	                System.out.println("Employee deleted successfully!");
	            } else {
	                System.out.println("No employee found with ID " + empid);
	            }
	        }
	    }
	    public static void selectrow(Scanner sc) throws SQLException {
	        System.out.println("Enter Employee ID to view details: ");
	        int empid = sc.nextInt();

	        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?useSSL=false","admin", "root")) {
	            String sql = "SELECT empid, empname, sal FROM employee WHERE empid = ?";
	            PreparedStatement pstmt = con.prepareStatement(sql);
	            pstmt.setInt(1, empid);

	            ResultSet rs = pstmt.executeQuery();
	            if (rs.next()) {
	                System.out.println("Employee ID: " + rs.getInt("empid"));
	                System.out.println("Employee Name: " + rs.getString("empname"));
	                System.out.println("Employee Salary: " + rs.getInt("sal"));
	            } else {
	                System.out.println("No employee found with ID " + empid);
	            }
	        }
	    }

	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int choice;
	        while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Insert a new Row");
	            System.out.println("2. Update a Row");
	            System.out.println("3. Delete a Row");
	            System.out.println("4. Select a Row");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            try {
	                switch (choice) {
	                    case 1:
	                        insertrow(sc);
	                        break;
	                    case 2:
	                        updaterow(sc);
	                        break;
	                    case 3:
	                        deleterow(sc);
	                        break;
	                    case 4:
	                        selectrow(sc);
	                        break;
	                    case 5:
	                        System.out.println("Exiting program.");
	                        sc.close();
	                        return;
	                    default:
	                        System.out.println("Invalid choice. Please try again.");
	                }
	            } catch (SQLException e) {
	                System.out.println("SQL Error: " + e.getMessage());
	            }
	        }
	    }
	}


