package com.files;
import java.io.File;

public class readwritepermissions {
    public static void main(String[] args) {
        File file = new File("src//example.txt");

        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
    }
}

