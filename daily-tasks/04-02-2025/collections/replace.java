package com.collections;
import java.util.ArrayList;
public class replace {
	public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.set(2, "Purple");
        System.out.println("Updated colors list: " + colors);
}
}