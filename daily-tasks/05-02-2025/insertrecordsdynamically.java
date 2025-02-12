package com.database;

import java.sql.*;
import java.util.Scanner;

public class insertrecordsdynamically {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?useSSL=false", "admin", "root");

            String sql = "INSERT INTO employee (empid, empname, sal) VALUES (?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(sql);

            while (true) {
                System.out.print("Enter Employee ID: ");
                int empid = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Employee Name: ");
                String empname = sc.nextLine();
                System.out.print("Enter Employee Salary: ");
                int sal = sc.nextInt();
                sc.nextLine(); 
                pstmt.setInt(1, empid);
                pstmt.setString(2, empname);
                pstmt.setInt(3, sal);
                int rowsInserted = pstmt.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Employee added successfully!");
                }

                System.out.print("Do you want to add another employee? (Y/N): ");
                String choice = sc.nextLine().trim().toUpperCase();
                if (choice.equals("N")) {
                    break;
                }
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

