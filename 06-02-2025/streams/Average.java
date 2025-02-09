package com.stream;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;
public class Average {
	 public static void main(String[] args) {
	      List <Integer> nums= Arrays.asList(4,2,3,6,11);
	      OptionalDouble averageofnums =nums.stream().mapToInt(Integer::intValue).average();
	      System.out.println("Average of list of Integers:"+averageofnums.getAsDouble());
	    }
}
