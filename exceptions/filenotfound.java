package com.exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class filenotfound {
    public static void readFile(String filename) throws FileNotFoundException {
        File file = new File("sample.txt");
        Scanner scanner = new Scanner(file); 
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    public static void main(String[] args) {
        try {
            readFile("sample.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Exception: File not found!");
        }
    }
}


