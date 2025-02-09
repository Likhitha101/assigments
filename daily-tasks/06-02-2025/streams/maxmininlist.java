package com.stream;
import java.util.ArrayList;
import java.util.stream.*;
public class maxmininlist {
 public static void main(String args[]) {
	 ArrayList<Integer> nums=new ArrayList<Integer>();
	 nums.add(8);
	 nums.add(7);
	 nums.add(1);
	 nums.add(3);
	 nums.add(5);
	
     int max = nums.stream().reduce(Integer.MIN_VALUE,(a, b) -> a > b ? a : b);
     int min = nums.stream().reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);
     System.out.println("Maximum value is "+max);
     System.out.println("Minimum value is "+min);
}

}