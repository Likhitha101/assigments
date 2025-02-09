package com.collections;

import java.util.LinkedList;
import java.util.Arrays;
public class multiplelements {
	public static void main(String args[]) {
		LinkedList<String> names=new LinkedList<>();
		names.add("Anu");
	    names.add("geetha");
	    names.add("sweety");
	    names.addLast("joy");
	    LinkedList<String> newNames = new LinkedList<>(Arrays.asList("arya", "john"));
	    names.addAll(1, newNames);

      System.out.println("Updated LinkedList: " + names);
}
}