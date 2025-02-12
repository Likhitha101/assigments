package javaassignments;
import java.util.Scanner;
public class UniqueCharacters {
	public static void main(String args[]) {
 String input;
 String output="";
 Scanner sc=new Scanner(System.in);
 input=sc.nextLine();
 for(int i=0;i<input.length();i++) {
     char ch = input.charAt(i);
     if (output.indexOf(ch) == -1) {
         output += ch;
     }
}
 System.out.println(output);
 sc.close();

}
}