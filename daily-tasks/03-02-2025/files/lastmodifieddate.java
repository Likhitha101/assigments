package com.files;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class lastmodifieddate {
    public static void main(String[] args) {
        File file = new File("src\\example.txt"); 

        if (file.exists()) {
            long lastModified = file.lastModified();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            System.out.println("Last modified date: " + sdf.format(new Date(lastModified)));
        } else {
            System.out.println("File does not exist.");
        }
    }
}


