package javaassignments;
import java.util.*;
public class smallestvowel {
            public static void main(String[] args) {
            	Scanner sc=new Scanner(System.in);
            	System.out.println("enter a string:");
            	String input=sc.nextLine();
            	char smallestvowel='z';
            	boolean foundvowel=false;
            	for(int i=0;i<input.length();i++) {
            		char ch=input.charAt(i);
            		if(ch=='a'||ch=='e'||ch=='i'||ch=='e'||ch=='u') {
            			if(ch<smallestvowel) {
            			smallestvowel=ch;
            			foundvowel=true;
            		}
            	}
            }
          if(foundvowel) {
        	  System.out.println("found a vowel matrix "+smallestvowel);
          }
          else {
        	  System.out.println("No vowels found");
          }
            
}

}
