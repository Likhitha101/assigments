package com.stream;
import java.util.ArrayList;
import java.util.stream.*;
public class sumofevenandodd {
  public static void main(String args[]) {
	  ArrayList<Integer> nums=new ArrayList<Integer>();
	  nums.add(9);
	  nums.add(8);
	  nums.add(7);
	  nums.add(6);
	  nums.add(5);
	  nums.add(4);
	  nums.add(3);
	  nums.add(2);
	  nums.add(1);
	  nums.add(6);
	  int evensum=nums.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
	  int oddsum=nums.stream().filter(n->n%2!=0).mapToInt(Integer::intValue).sum();
	  System.out.println("Sum of even numbers:"+evensum);
	  System.out.println("Sum of odd numbers:"+oddsum);
  }
}
