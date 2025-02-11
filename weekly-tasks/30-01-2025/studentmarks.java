package trainingtasks;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class task6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        Arraylist<double>=new 
        double[] averages = new double[n]; 
        for (int i = 0; i < n; i++) {
            System.out.println("Enter your name:");
            String name = sc.nextLine();

            System.out.println("Enter marks1:");
            int marks1 = sc.nextInt();

            System.out.println("Enter marks2:");
            int marks2 = sc.nextInt();
            sc.nextLine(); 
            double[] results = calculateTotalAndAverage(marks1, marks2);
            double total = results[0];
            double avg = results[1];

            averages[i] = avg; 

            System.out.println("Total marks for " + name + ": " + total);
            System.out.println("Average for " + name + ": " + avg);
        }
        sc.close();
        Arrays.sort(averages);
        System.out.println("\nSorted Averages:");
        for (double avg : averages) {
            System.out.println(avg);
        }
    }

    public static double calculateTotalAndAverage(int marks1, int marks2) {
        double total = marks1 + marks2;
        return total/2.0;
    }
}
