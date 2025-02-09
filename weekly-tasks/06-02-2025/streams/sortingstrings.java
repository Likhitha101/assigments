package com.stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class sortingstrings {
 public static void main(String args[]) {
	 ArrayList<String> stringlist=new ArrayList<String>();
	 stringlist.add("song");
	 stringlist.add("kite");
	 stringlist.add("world");
	 stringlist.add("pig");
	 stringlist.add("chair");
	 List<String> ascendingorder=stringlist.stream().sorted().collect(Collectors.toList());
	 List<String> descendingorder=stringlist.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
	 System.out.println("Sorted in ascending order:"+ascendingorder);
	 System.out.println("Sorted in ascending order:"+descendingorder);
 }
}
