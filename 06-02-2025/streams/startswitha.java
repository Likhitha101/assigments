package com.stream;
import java.util.ArrayList;
import java.util.stream.*;
public class startswitha {
	public static void main(String args[]) {
    ArrayList<String> stringlist=new ArrayList<String>();
    stringlist.add("arjun");
    stringlist.add("america");
    stringlist.add("oliveoil");
    stringlist.add("avocado");
    long count=stringlist.stream().filter(s->s.startsWith("a")).count();
    System.out.println("here's the number of strings starting with a "+count);
}
}