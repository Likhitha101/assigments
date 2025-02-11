package com.generics;
import java.util.List;
 
public class FirstOccurance {
    public static <T> int firstoccurence(List<T> list, T target) {
        return list.indexOf(target);
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(10, 20, 30, 40, 20, 50);
        System.out.println("Index of 20: " + firstoccurence(intList, 20)); 
        System.out.println("Index of 60: " + firstoccurence(intList, 60)); 

        List<String> strList = List.of("python", "java", "ruby", "rust");
        System.out.println("Index of 'python': " +firstoccurence(strList, "python")); 
        System.out.println("Index of 'ruby': " +firstoccurence(strList, "ruby")); 
    }
}

