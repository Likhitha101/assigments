package javaassignments;
import java.util.Scanner;
public class Lastcharacter {
	

	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	        String input = sc.nextLine();
	        String[] words = input.split("\\s+");
	        StringBuilder result = new StringBuilder();
	        for (String word : words) {
	            if (word.matches("[a-zA-Z]+")) {
	                result.append(word.charAt(word.length() - 1));
	            }
	        }
	        System.out.println(result.toString());
	    }
	}

