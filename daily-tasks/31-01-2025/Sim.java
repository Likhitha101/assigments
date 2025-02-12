package javaassignments;
import java.util.*;
public class Sim {
	    private int simId;
	    private String customerName;
	    private double balance;
	    private double ratePerSecond;
	    private String circle;
	    public Sim(int simId, String customerName, double balance, double ratePerSecond, String circle) {
	        this.simId = simId;
	        this.customerName = customerName;
	        this.balance = balance;
	        this.ratePerSecond = ratePerSecond;
	        this.circle = circle;
	    }
	    public int getSimId() {
	        return simId;
	    }

	    public String getCustomerName() {
	        return customerName;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public double getRatePerSecond() {
	        return ratePerSecond;
	    }

	    public String getCircle() {
	        return circle;
	    }
	    public void setCircle(String circle) {
	        this.circle = circle;
	    }
	}

	public class Solution {
	    public static Sim[] transferCircle(Sim[] sims, String circle1, String circle2) {
	        List<Sim> filteredList = new ArrayList<>();
	        for (Sim sim : sims) {
	            if (sim.getCircle().equalsIgnoreCase(circle1)) {
	                Sim updatedSim = new Sim(sim.getSimId(), sim.getCustomerName(), sim.getBalance(), sim.getRatePerSecond(), circle2);
	                filteredList.add(updatedSim);
	            }
	        }
	        filteredList.sort((s1, s2) -> Double.compare(s2.getRatePerSecond(), s1.getRatePerSecond()));

	        return filteredList.toArray(new Sim[0]);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        Sim[] sims = new Sim[5];
	        for (int i = 0; i < 5; i++) {
	            int simId = sc.nextInt();
	            sc.nextLine(); 
	            String customerName = sc.nextLine();
	            double balance = sc.nextDouble();
	            double ratePerSecond = sc.nextDouble();
	            sc.nextLine(); 
	            String circle = sc.nextLine();
	            sims[i] = new Sim(simId, customerName, balance, ratePerSecond, circle);
	        }
	        String circle1 = sc.nextLine();
	        String circle2 = sc.nextLine();
	        Sim[] result = transferCircle(sims, circle1, circle2);

	        for (Sim sim : result) {
	            System.out.println(sim.getSimId() + " " + sim.getCustomerName() + " " + sim.getCircle() + " " + sim.getRatePerSecond());
	        }

	        sc.close();
	    }
	}

