package com.files;
import java.io.File;
public class filesexistsornot {
     public static void main(String[] args) {
	        File file = new File("C:\\test"); 
	        
	        if (file.exists()) {
	            System.out.println("File/Directory exists.");
	        } else {
	            System.out.println("File/Directory does not exist.");
	        }
	    }
	}

