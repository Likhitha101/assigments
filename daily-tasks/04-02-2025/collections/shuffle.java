package com.collections;
import java.util.ArrayList;
import java.util.Collections;
public class shuffle {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        Collections.shuffle(colors);
        System.out.println("Shuffled List: " + colors);
    }
}
