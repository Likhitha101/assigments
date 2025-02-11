package com.generics;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayComparison {
	    public static <T> boolean areArraysEqual(T[] array1, T[] array2) {
	        return Arrays.equals(array1, array2);
	    }

	    public static <T> T[] getuserarray(Scanner scanner, int size, Class<T> clazz) {
	        T[] array = (T[]) java.lang.reflect.Array.newInstance(clazz, size);
	        System.out.println("Enter " + size + " elements:");
	        for (int i = 0; i < size; i++) {
	            if (clazz == Integer.class) {
	                array[i] = clazz.cast(scanner.nextInt());
	            } else if (clazz == String.class) {
	                array[i] = clazz.cast(scanner.next());
	            }
	        }
	        return array;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the size of the arrays: ");
	        int size = scanner.nextInt();

	        System.out.print("Enter the type of array (1 for Integer, 2 for String): ");
	        int choice = scanner.nextInt();

	        if (choice == 1) {
	            Integer[] array1 = getuserarray(scanner, size, Integer.class);
	            Integer[] array2 = getuserarray(scanner, size, Integer.class);
	            System.out.println("Are the arrays equal? " + areArraysEqual(array1, array2));
	        } else if (choice == 2) {
	            String[] array1 = getuserarray(scanner, size, String.class);
	            String[] array2 = getuserarray(scanner, size, String.class);
	            System.out.println("Are the arrays equal? " + areArraysEqual(array1, array2));
	        } else {
	            System.out.println("Invalid choice.");
	        }

	        scanner.close();
	    }
	}


