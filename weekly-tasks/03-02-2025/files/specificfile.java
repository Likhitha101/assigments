package com.files;
import java.io.File;
import java.io.FilenameFilter;

public class specificfile {
    public static void main(String[] args) {
        File directory = new File("C:\\Users\\admin\\eclipse-workspace\\javapratice\\src\\trainingtasks"); 
        String extension = ".txt"; 
        FilenameFilter filter = (dir, name) -> name.endsWith(extension);
        String[] files = directory.list(filter);

        if (files != null) {
            for (String file : files) {
                System.out.println(file);
            }
        } else {
            System.out.println("Files not found.");
        }
    }
}


