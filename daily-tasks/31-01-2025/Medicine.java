package javaassignments;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Medicine {
 String MedicineName;
 String batch;
 String disease;
 int price;
 public Medicine(String MedicineName, String batch,String disease,int price) {
	 MedicineName=this.MedicineName;
	 batch=this.batch;
	 disease= this.disease;
	 price=this.price;
 }
 public String getMedicineName() {
	 return MedicineName;
 }
 public String batch() {
	 return batch;
 }
 public String disease() {
	 return disease;
 }
 public int price() {
	 return price;
 }
 public void setMedicineName(String MedicineName) {
	 this.MedicineName=MedicineName;
 }
 public void setbatch(String batch) {
	 this.batch=batch;
 }
 public void setdisease(String disease) {
	 this.disease=disease;
 }
 public void setMedicineName() {
	 this.price=price;
 }
 class Solution {
	    public static Integer[] getPriceByDisease(Medicine[] medicines, String disease) {
	        List<Integer> prices = new ArrayList<>();
	        for (Medicine medicine : medicines) {
	            if (medicine.disease().equalsIgnoreCase(disease)) {
	                prices.add(medicine.price());
	            }
	        }
	        Collections.sort(prices);
	        return prices.toArray(new Integer[0]);
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        Medicine[] medicines = new Medicine[4];
	        for (int i = 0; i < 4; i++) {
	            String medicineName = scanner.nextLine();
	            String batch = scanner.nextLine();
	            String disease = scanner.nextLine();
	            int price = Integer.parseInt(scanner.nextLine());
	            medicines[i] = new Medicine(medicineName, batch, disease, price);
	        }

	        String disease = scanner.nextLine();

	        Integer[] prices = Solution.getPriceByDisease(medicines, disease);
	        for (int price : prices) {
	            System.out.println(price);
	        }

	        scanner.close();
	    }
}
}
