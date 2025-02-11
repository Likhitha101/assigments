package com.generics;
import java.util.ArrayList;
import java.util.List;
public class Mergealternateelements {

	    public static <T> List<T> mergelists(List<T> list1, List<T> list2) {
	        List<T> mergedList = new ArrayList<T>();
	        int maxlength = Math.max(list1.size(), list2.size());

	        for (int i = 0; i < maxlength; i++) {
	            if (i < list1.size()) {
	                mergedList.add(list1.get(i));
	            }
	            if (i < list2.size()) {
	                mergedList.add(list2.get(i));
	            }
	        }
	        return mergedList;
	    }

	    public static void main(String[] args) {
	        List<Integer> list1 = List.of(1,3,4,5);
	        List<Integer> list2 = List.of(2,6,8,10);
	        System.out.println("Merged List: " + mergelists(list1, list2));

	        List<String> strList1 = List.of("A", "C", "E");
	        List<String> strList2 = List.of("B", "D", "F", "G");
	        System.out.println("Merged List: " + mergelists(strList1, strList2));
	    }
	}

