package com.generics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reversealist{
    public static <T> List<T> reverselist(List<T> list) {
        List<T> reversedlist = new ArrayList<>(list);
        Collections.reverse(reversedlist);
        return reversedlist;
    }
    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        System.out.println("Reversed list: " + reverselist(intList));

        List<String> strList = List.of("A", "B", "C", "D");
        System.out.println("Reversed list: " + reverselist(strList));
    }
}
