package javaassignments;
import java.util.Scanner;

public class reverseastring {
  public static void main(String args[]) {
  String str2="";
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a string:");
  String string=sc.nextLine();
  sc.close();
  for(int i=string.length()-1;i>=0;i--) {
	   str2=str2+string.charAt(i);
  }
  System.out.println("after reversing"+str2.toLowerCase());
  
}
}