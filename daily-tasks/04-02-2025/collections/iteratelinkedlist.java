package com.collections;
import java.util.LinkedList;
public class iteratelinkedlist {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Anu");
        names.add("geetha");
        names.add("sweety");
        names.addLast("joy");
        for (String name : names) {
            System.out.println(name);
        }
    }

}
