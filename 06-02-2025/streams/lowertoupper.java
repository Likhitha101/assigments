package com.stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

	public class lowertoupper {
	    public static void main(String[] args) {
	    	ArrayList <String> stringvalues=new ArrayList<String>();
	    	stringvalues.add("ball");
	    	stringvalues.add("animal");
	    	stringvalues.add("coconut");
	    	stringvalues.add("lock");
	    	List<String> uppercase=stringvalues.stream().map(String::toUpperCase).collect(Collectors.toList());
	    	System.out.println("Lowercase to Uppercase" +uppercase);
	    }
	}

