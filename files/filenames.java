package com.files;
import java.io.File;
public class filenames {
      public static void main(String[] args) {
	        File directory = new File("C:\\Users\\admin\\eclipse-workspace\\javapratice\\src\\trainingtasks");
	        String[] files = directory.list();

	        if (files != null) {
	        	for (int i = 0; i < files.length; i++) {
	        	    System.out.println(files[i]);
	        	}
	        } else {
	            System.out.println("Directory does not exist or is empty.");
	        }
	    }
	}


