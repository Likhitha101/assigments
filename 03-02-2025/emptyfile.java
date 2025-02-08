package com.exceptions;

import java.io.File;
import java.io.FileNotFoundException;

class emptyfileException extends Exception {
    public emptyfileException(String message) {
        super(message);
    }
}

public class emptyfile {

    
    public static void checkFile(String filename) throws FileNotFoundException, emptyfileException {
        File file = new File(filename);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found!");
        }
        
        
        if (file.length() == 0) {
            throw new emptyfileException("File is empty!");
        }
        
        System.out.println("File is not empty.");
    }

    public static void main(String[] args) {
        try {
            checkFile("sample.txt"); 
        } catch (FileNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (emptyfileException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
