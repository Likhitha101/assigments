package javaassignments;

import java.util.Arrays;
import java.util.Scanner;

class Inventory {
 private String inventoryId;
 private int maximumQuantity;
 private int currentQuantity;
 private int threshold;
 
 public Inventory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold) {
     this.inventoryId = inventoryId;
     this.maximumQuantity = maximumQuantity;
     this.currentQuantity = currentQuantity;
     this.threshold = threshold;
 }

 public String getInventoryId() {
     return inventoryId;
 }

 public void setInventoryId(String inventoryId) {
     this.inventoryId = inventoryId;
 }

 public int getMaximumQuantity() {
     return maximumQuantity;
 }

 public void setMaximumQuantity(int maximumQuantity) {
     this.maximumQuantity = maximumQuantity;
 }

 public int getCurrentQuantity() {
     return currentQuantity;
 }

 public void setCurrentQuantity(int currentQuantity) {
     this.currentQuantity = currentQuantity;
 }

 public int getThreshold() {
     return threshold;
 }

 public void setThreshold(int threshold) {
     this.threshold = threshold;
 }
}


class Solution {
 public static Inventory[] replenish(Inventory[] inventories, int limit) {
     
     return Arrays.stream(inventories)
             .filter(inventory -> inventory.getThreshold() <= limit)
             .toArray(Inventory[]::new);
 }
}

public class InventoryManagement {

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Inventory[] inventories = new Inventory[4];

     for (int i = 0; i < 4; i++) {
         String inventoryId = scanner.nextLine();
         int maximumQuantity = scanner.nextInt();
         int currentQuantity = scanner.nextInt();
         int threshold = scanner.nextInt();
         scanner.nextLine(); 
         inventories[i] = new Inventory(inventoryId, maximumQuantity, currentQuantity, threshold);
     }

     int limit = scanner.nextInt();
     Inventory[] replenishedInventories = Solution.replenish(inventories, limit);
     
     for (Inventory inventory : replenishedInventories) {
         System.out.print(inventory.getInventoryId() + " ");
         if (inventory.getThreshold() > 75) {
             System.out.println("Critical Filling");
         } else if (inventory.getThreshold() >= 50) {
             System.out.println("Moderate Filling");
         } else {
             System.out.println("Non-Critical Filling");
         }
     }

     scanner.close();
 }
}
