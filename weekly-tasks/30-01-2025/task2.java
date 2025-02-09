package trainingtasks;


public class task2 {

	    public static void main(String[] args) {
	        // Source array
	        int[] sourceArray = {1, 2, 3, 4, 5};
	        
	        // Destination array (must have enough space)
	        int[] destinationArray = {6,7,8,9,10};

	        // Using System.arraycopy()
	        System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);

	        // Printing the destination array
	        System.out.print("Copied Array: ");
	        for (int num : destinationArray) {
	            System.out.print(num + " ");
	        }
	    }
	}

