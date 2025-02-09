package com.collections;

import java.util.LinkedList;

public class occurance {
	public static void main(String args[]) {
		LinkedList<String> names=new LinkedList<>();
		names.add("Anu");
	    names.add("geetha");
	    names.add("sweety");
	    names.addLast("joy");
	    int firstIndex = names.indexOf("Anu");
        int lastIndex = names.lastIndexOf("Anu");

        System.out.println("First occurrence of Anu: " + firstIndex);
        System.out.println("Last occurrence of Anu: " + lastIndex);
}
}
