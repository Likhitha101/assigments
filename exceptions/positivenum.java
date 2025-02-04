package com.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class PositiveNumberException extends Exception {
    public PositiveNumberException(String message) {
        super(message);
    }


public class CheckNegativeNumbers {
    public static void checkNumbers(String filename) throws FileNotFoundException, PositiveNumberException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if (num > 0) {
                scanner.close();
                throw new PositiveNumberException("Positive number found: " + num);
            }
        }
        scanner.close();
        System.out.println("All numbers are negative.");
    }

    public static void main(String[] args) {
        try {
            checkNumbers("numbers.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Exception: File not found!");
        } catch (PositiveNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
}