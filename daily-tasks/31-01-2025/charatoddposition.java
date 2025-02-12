package javaassignments;
import java.util.Scanner;
public class charatoddposition {
	    public static void main(String[] args) {
	       Scanner sc=new Scanner(System.in);
	        String input = sc.nextLine();
	        StringBuilder result = new StringBuilder();
	        for (int i = 1; i < input.length(); i += 2) {
	            result.append(input.charAt(i));
	        }
	        System.out.println(result.toString());
	    }
	}

