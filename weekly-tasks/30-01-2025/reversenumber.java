package trainingtasks;
import java.util.Scanner;
class reversenumber{
	public static void main(String args[]) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int result=reverse(num);
		System.out.println("Reversed number: " + result);
		sc.close();
	}
	public static int reverse(Integer num) {
           int reversed=0;
			while(num!=0) {
				 int digit = num % 10;  
		            reversed = reversed * 10 + digit;
		            num = num / 10; 
				
			}
			return reversed;
		}
}