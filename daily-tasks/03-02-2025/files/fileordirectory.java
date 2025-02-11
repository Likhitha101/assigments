package com.files;
import java.io.File;

public class fileordirectory {
    public static void main(String[] args) {
        File file = new File("src\\example1"); 

        if (file.isDirectory()) {
            System.out.println("It is a directory.");
        } else if (file.isFile()) {
            System.out.println("It is a file.");
        } else {
            System.out.println("Path does not exist.");
        }
    }
}