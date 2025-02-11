package com.files;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Readinputfromconsole {
	public class ConsoleReadBufferedReader {
	    public static void main(String[] args) throws IOException {
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	        System.out.print("Enter your name: ");
	        String name = reader.readLine(); 

	        System.out.print("Enter your age: ");
	        int age = Integer.parseInt(reader.readLine()); 
	        System.out.println("\nHello, " + name + "! You are " + age + " years old.");
	    }
	}

}
