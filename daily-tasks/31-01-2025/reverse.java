package trainingtasks;
import java.util.Scanner;
class reverse{
	public static void main(String args[]) {
		System.out.println("enter a name");
		Scanner sc=new Scanner(System.in);
		
		String name=sc.nextLine();
		StringBuilder sb=new StringBuilder(name);
		sb.reverse();
		String result = sb.toString().toLowerCase();
		System.out.println("Result is "+result);
		sc.close();
		}	
	}
