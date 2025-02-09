package trainingtasks;

import java.util.Scanner;

class uniquechars{
	public static void main(String args[]) {
		System.out.println("enter input");
		Scanner sc=new Scanner(System.in) ;
		String input=sc.nextLine();
		String result=" ";
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if (result.indexOf(ch)==-1){
                result += ch;
		}
		
	}
		System.out.println("Unique characters: " + result);
	}
}