package com.collections;
import java.util.LinkedList;
public class appendtolinkedlist {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Anu");
        names.add("geetha");
        names.add("sweety");
        names.addLast("joy");

        System.out.println("Updated LinkedList: " + names);
    }

}
