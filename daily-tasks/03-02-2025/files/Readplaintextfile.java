package com.files;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Readplaintextfile {
	    public static void main(String[] args) {
	        File file = new File("src//example.txt"); 

	        try (Scanner scanner = new Scanner(file)) {
	            while (scanner.hasNextLine()) {
	                System.out.println(scanner.nextLine());
	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found: " + e.getMessage());
	        }
	    }
	}

