package javaassignments;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Sim2 {
    private int id;
    private String company;
    private int balance;
    private double ratePerSecond;
    private String circle;

    public Sim2(int id, String company, int balance, double ratePerSecond, String circle) {
        this.id = id;
        this.company = company;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getRatePerSecond() {
        return ratePerSecond;
    }

    public void setRatePerSecond(double ratePerSecond) {
        this.ratePerSecond = ratePerSecond;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }
}

class Solution {
    public static Sim2[] matchAndSort(Sim2[] sims, String search_circle, double search_rate) {
        return Arrays.stream(sims)
                .filter(sim -> sim.getCircle().equals(search_circle) && sim.getRatePerSecond() < search_rate)
                .sorted(Comparator.comparingInt(Sim2::getBalance).reversed())
                .toArray(Sim2[]::new);
    }
}

public class SimCardManagement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sim2[] sims = new Sim2[4];

        for (int i = 0; i < 4; i++) {
            int id = scanner.nextInt();
            String company = scanner.next();
            int balance = scanner.nextInt();
            double ratePerSecond = scanner.nextDouble();
            String circle = scanner.next();
            sims[i] = new Sim2(id, company, balance, ratePerSecond, circle);
        }

        String search_circle = scanner.next();
        double search_rate = scanner.nextDouble();

        Sim2[] matchedSims = Solution.matchAndSort(sims, search_circle, search_rate);

        for (Sim2 sim : matchedSims) {
            System.out.println(sim.getId());
        }

        scanner.close();
    }
}
