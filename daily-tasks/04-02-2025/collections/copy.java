package com.collections;
import java.util.ArrayList;
public class copy {
	public static void main(String[] args) {
        ArrayList<String> original = new ArrayList<>();
        original.add("Red");
        original.add("Blue");
        original.add("Green");

        ArrayList<String> copiedList = new ArrayList<>(original);

        System.out.println("Copied List: " + copiedList);

}
}