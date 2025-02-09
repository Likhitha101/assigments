package com.collections;
import java.util.ArrayList;
public class removethirdelement {
	 public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Purple");
	        colors.remove(2);

	        System.out.println("After removing third element: " + colors);
}
}