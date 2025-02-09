package com.stream;
import java.util.ArrayList;
import java.util.stream.*;
import java.util.List;
public class removeduplicates {
public static void main(String args[]) {
	ArrayList<Integer> nums=new ArrayList<Integer>();
	nums.add(7);
	nums.add(6);
	nums.add(2);
	nums.add(2);
	nums.add(3);
	nums.add(6);
	List<Integer> duplicates=nums.stream().distinct().collect(Collectors.toList());
	System.out.println("After removing duplicates "+duplicates);
	
}
}
