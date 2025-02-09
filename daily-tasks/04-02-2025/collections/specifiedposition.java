package com.collections;
import java.util.ListIterator;
import java.util.LinkedList;
public class specifiedposition {
public static void main(String args[]) {
	LinkedList<String> names=new LinkedList<>();
	 names.add("Anu");
     names.add("geetha");
     names.add("sweety");
     names.addLast("joy");
     ListIterator<String> iterator = names.listIterator(2);
     while (iterator.hasNext()) {
         System.out.println(iterator.next());
}
}
}