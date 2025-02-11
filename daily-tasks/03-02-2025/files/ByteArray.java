package com.files;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class ByteArray {

	    public static void main(String[] args) {
	        File file = new File("src//example.txt"); 

	        try (FileInputStream fis = new FileInputStream(file)) {
	            byte[] data = new byte[(int) file.length()];
	            fis.read(data);
	            
	            System.out.println("File content in bytes:");
	            for (byte b : data) {
	                System.out.print((char) b); 
	            }
	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }
	    }
	}
