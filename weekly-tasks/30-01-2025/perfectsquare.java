package trainingtasks;
import java.util.Scanner;

class perfectsquare {
    public static void main(String args[]) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        if (isPerfectSquare(num)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num); 
        return sqrt * sqrt == num;      
    }
}