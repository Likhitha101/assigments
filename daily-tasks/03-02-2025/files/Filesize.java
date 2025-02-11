package com.files;
import java.io.File;
public class Filesize {
	    public static void main(String[] args) {
	        File file = new File("src\\example.txt"); 

	        if (file.exists() && file.isFile()) {
	            long bytes = file.length();
	            double kilobytes = bytes / 1024.0;
	            double megabytes = kilobytes / 1024.0;

	            System.out.println("File Size in Bytes: " + bytes);
	            System.out.println("File Size in KB: " + kilobytes);
	            System.out.println("File Size in MB: " + megabytes);
	        } else {
	            System.out.println("File does not exist or is not a valid file.");
	        }
	    }
	}
