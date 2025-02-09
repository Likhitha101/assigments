package trainingtasks;
import java.util.Scanner;
import java.lang.StringBuilder;
class task5{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String input=sc.nextLine();
		String result=capitalizeAlternate(input);
		System.out.print("result" +result);
		sc.close();
	}
		public static String capitalizeAlternate(String str){
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<str.length();i++) {
				char ch=str.charAt(i);
				if(i%2==0) {
					sb.append(Character.toUpperCase(ch));
				}
				else {
					sb.append(Character.toLowerCase(ch));
				}
			}
			return sb.toString();
			
	}
}