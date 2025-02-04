package trainingtasks;
import java.util.Scanner;
class Characteratoddpos{
	public static void main(String args[]) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		sc.close();
		for(int i=0;i<input.length();i+=2) {
			  System.out.print(input.charAt(i));
			  }    
		}
	}
