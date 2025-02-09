package com.collections;

import java.util.LinkedList;
import java.util.ListIterator;
public class reverse {
	public static void main(String args[]) {
	LinkedList<String> names=new LinkedList<>();
	names.add("Anu");
    names.add("geetha");
    names.add("sweety");
    names.addLast("joy");
    ListIterator<String> iterator = names.listIterator(names.size());
      while (iterator.hasPrevious()) {
          System.out.println(iterator.previous());
      }
}
}