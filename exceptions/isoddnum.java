package com.exceptions;

public class isoddnum {
    public static void checkEven(int num) throws IllegalArgumentException {
        if (num % 2 != 0) {
            throw new IllegalArgumentException("Number is odd.");
        }
    }

    public static void main(String[] args) {
        try {
            checkEven(7); 
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}