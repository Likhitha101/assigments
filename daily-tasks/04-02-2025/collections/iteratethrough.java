package com.collections;
import java.util.ArrayList;
public class iteratethrough {
	 public static void main(String args[]) {
		 ArrayList<String> colors=new ArrayList<String>();
		 colors.add("blue");
		 colors.add("black");
		 colors.add("pink");
		 colors.add("yellow");
		 colors.add("green");
		 colors.add("brown");
	     System.out.println("Iterating through all elements:");
	     for (String color : colors) {
	            System.out.println(color);
	        }

	     
	 }

}
