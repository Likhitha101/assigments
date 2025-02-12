package javaassignments;
import java.util.Scanner;
public class Perfectsquare {
		 public static boolean isperfectsquare(int num) {
			 int sqrt = (int) Math.sqrt(num);
			 return sqrt * sqrt == num;
		 }
		 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter a number:");
		 int num=sc.nextInt();
		 if(isperfectsquare(num)) {
			 System.out.println("True");
		 }
		 else {
			 System.out.println("False");
		 }
		 }
}