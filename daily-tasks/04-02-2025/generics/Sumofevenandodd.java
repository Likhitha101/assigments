package com.generics;
import java.util.List;
public class Sumofevenandodd {
	    public static <T extends Number> void sumevenodd(List<T> numbers) {
	        int evenSum = 0, oddSum = 0;

	        for (T num : numbers) {
	            int value = num.intValue();
	            if (value % 2 == 0) {
	                evenSum += value;
	            } else {
	                oddSum += value;
	            }
	        }

	        System.out.println("Sum of even numbers: " + evenSum);
	        System.out.println("Sum of odd numbers: " + oddSum);
	    }

	    public static void main(String[] args) {
	        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	        sumevenodd(numbers);

	        List<Double> doubleNumbers = List.of(1.5, 2.5, 3.0, 4.0, 5.0);
	        sumevenodd(doubleNumbers);
	    }
	}

