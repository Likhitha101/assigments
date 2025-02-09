package com.collections;
import java.util.ArrayList;
public class retrieveelement {
	public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        String coloratindex3 = colors.get(3);
        
        // Print the retrieved element
        System.out.println("Element at index 3: " + coloratindex3);
    }

}
