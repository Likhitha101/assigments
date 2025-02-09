package com.collections;
import java.util.ArrayList;
public class firstposition {
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add(0, "Pink");
	        System.out.println("Updated colors list: " + colors);
	    }
	}
