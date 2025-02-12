package javaassignments;
import java.util.Scanner;
public class reverseanumber {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number: ");
	int num=sc.nextInt();
	int rev=0;
	while(num!=0) {
		int dig=num%10;
		rev=(rev*10)+dig;
		num=num/10;
	}
	System.out.println("reverse is:"+rev);
}
}
