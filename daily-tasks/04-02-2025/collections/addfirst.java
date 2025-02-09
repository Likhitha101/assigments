package com.collections;
import java.util.LinkedList;
public class addfirst {
	public static void main(String args) {
	 LinkedList<String> names=new LinkedList<>();
 	 names.add("Anu");
     names.add("geetha");
     names.add("sweety");
     names.addFirst("Aliya");

     System.out.println("Updated LinkedList: " + names);

}
}