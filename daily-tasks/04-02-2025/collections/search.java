package com.collections;
import java.util.ArrayList;
public class search {
	 public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
            String searchColor = "Green";
	        if (colors.contains(searchColor)) {
	            System.out.println(searchColor + " is found in the list.");
	        } else {
	            System.out.println(searchColor + " is not found in the list.");
	        }
}
}