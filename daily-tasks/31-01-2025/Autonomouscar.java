package javaassignments;

import java.util.*;

class AutonomousCar {
    private int carId;
    private String brand;
    private int noOfTestsConducted;
    private int noOfTestsPassed;
    private String environment;
    private String grade;

    public AutonomousCar(int carId, String brand, int noOfTestsConducted, int noOfTestsPassed, String environment) {
        this.carId = carId;
        this.brand = brand;
        this.noOfTestsConducted = noOfTestsConducted;
        this.noOfTestsPassed = noOfTestsPassed;
        this.environment = environment;
        this.grade = "";
    }

    public int getCarId() {
        return carId;
    }

    public int getNoOfTestsPassed() {
        return noOfTestsPassed;
    }

    public String getEnvironment() {
        return environment;
    }

    public String getBrand() {
        return brand;
    }

    public int getNoOfTestsConducted() {
        return noOfTestsConducted;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
}

class Solution {
    public static int findTestPassedByEnv(AutonomousCar[] cars, String environment) {
        int totalPassed = 0;
        for (AutonomousCar car : cars) {
            if (car.getEnvironment().equalsIgnoreCase(environment)) {
                totalPassed += car.getNoOfTestsPassed();
            }
        }
        return totalPassed;
    }

    public static AutonomousCar updateCarGrade(AutonomousCar[] cars, String brand) {
        for (AutonomousCar car : cars) {
            if (car.getBrand().equalsIgnoreCase(brand)) {
                int rating = car.getNoOfTestsConducted() == 0 ? 0 : (car.getNoOfTestsPassed() * 100) / car.getNoOfTestsConducted();
                car.setGrade(rating >= 80 ? "A1" : "B2");
                return car;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AutonomousCar[] cars = new AutonomousCar[4];

        for (int i = 0; i < 4; i++) {
            int carId = sc.nextInt();
            sc.nextLine();
            String brand = sc.nextLine();
            int noOfTestsConducted = sc.nextInt();
            int noOfTestsPassed = sc.nextInt();
            sc.nextLine();
            String environment = sc.nextLine();
            cars[i] = new AutonomousCar(carId, brand, noOfTestsConducted, noOfTestsPassed, environment);
        }

        String searchEnvironment = sc.nextLine();
        String searchBrand = sc.nextLine();

        int totalPassed = findTestPassedByEnv(cars, searchEnvironment);
        System.out.println(totalPassed > 0 ? totalPassed : "There are no tests passed in this particular environment");

        AutonomousCar car = updateCarGrade(cars, searchBrand);
        System.out.println(car != null ? car.getCarId() + "::" + car.getGrade() : "No Car is available with the specified brand");

        sc.close();
    }
}
