package com.files;
import java.io.File;

public class readwritepermissions {
    public static void main(String[] args) {
        File file = new File("C:\\test");

        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
    }
}

