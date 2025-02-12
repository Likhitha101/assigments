package trainingtasks;
import java.util.Arrays;
import java.util.Scanner;
public class copyalternateelements {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the size of array: ");
	        int size = scanner.nextInt();
            int[] originalarray = new int[size];
	        System.out.println("Enter " + size + " elements:");
	        for (int i = 0; i < size; i++) {
	            originalarray[i] = scanner.nextInt();
	        }
	        int newsize = (size + 1) / 2;
	        int[] alternateArray = new int[newsize];
	        int index = 0;
	        for (int i = 0; i < size; i += 2) {
	            alternateArray[index++] = originalarray[i];
	        }
	        System.out.println("New array with alternate elements: " + Arrays.toString(alternateArray));

	        scanner.close();
	    }
	}

