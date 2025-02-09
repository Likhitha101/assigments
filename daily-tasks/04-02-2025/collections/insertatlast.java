package com.collections;

import java.util.LinkedList;

public class insertatlast {
	public static void main(String args[]) {
		LinkedList<String> names=new LinkedList<>();
		names.add("Anu");
	    names.add("geetha");
	    names.add("sweety");
	    names.addLast("joy");
	    names.add(1, "ravi");
        names.addFirst("jerry");

    System.out.println("Updated LinkedList: " + names);

}
}