package com.collections;
import java.util.LinkedList;
public class firstandlast {
	public static void main(String args[]) {
     LinkedList<String> names=new LinkedList<>();
 	 names.add("Anu");
     names.add("geetha");
     names.add("sweety");
     names.addLast("joy");
     names.addFirst("Alice");
     names.addLast("David");
     System.out.println("Updated LinkedList: " + names);
}
}