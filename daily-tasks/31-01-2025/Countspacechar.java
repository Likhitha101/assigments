package javaassignments;
import java.util.*;
import java.util.Scanner;
public class Countspacechar {
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String input=sc.nextLine();
	        int spacecount=0;
	        int charcount=0;
	        for(int i=0;i<input.length();i++) {
	        	char ch = input.charAt(i);
	        	if(ch==' ') {
	        		spacecount++;
	        	}
	        	else if(!Character.isDigit(ch)){
	        		charcount++;
	        	}
	        }
	        
	        System.out.println("No of spaces : " + spacecount + " and characters : " + charcount);
	    }
	}

