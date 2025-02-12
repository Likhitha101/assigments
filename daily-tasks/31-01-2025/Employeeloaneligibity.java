package trainingtasks;
import java.util.Scanner;

	class Employee {
	    private int empId;
	    private String empName;
	    private double sal; 
	    private int yearsWorked;
	    public void setEmployeeDetails(int empId, String empName, double sal, int yearsWorked) {
	        this.empId = empId;
	        this.empName = empName;
	        this.sal = sal;
	        this.yearsWorked = yearsWorked;
	    }
	    public void getEmployeeDetails() {
	        System.out.println("\nEmployee Details:");
	        System.out.println("ID: " + empId);
	        System.out.println("Name: " + empName);
	        System.out.println("Monthly Salary: " + sal);
	        System.out.println("Years Worked: " + yearsWorked);
	    }
	    public void getLoanEligibility() {
	        if (yearsWorked <= 5) {
	            System.out.println(empName + " is NOT eligible for a loan (Work experience must be greater than 5 years).");
	            return;
	        }

	        double annualSalary = sal * 12;
	        double loanAmount = 0;

	        if (annualSalary >= 15_00_000) {
	            loanAmount = 7_00_000;
	        } else if (annualSalary >= 10_00_000) {
	            loanAmount = 5_00_000;
	        } else if (annualSalary >= 6_00_000) {
	            loanAmount = 2_00_000;
	        }

	        if (loanAmount > 0) {
	            System.out.println(empName + " is eligible for a loan of ₹" + loanAmount);
	        } else {
	            System.out.println(empName + " is NOT eligible for a loan.");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter Employee ID: ");
	        int id = scanner.nextInt();
	        
	        scanner.nextLine();
	        
	        System.out.print("Enter Employee Name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter Monthly Salary: ");
	        double salary = scanner.nextDouble();
            System.out.print("Enter Years Worked: ");
	        int years = scanner.nextInt();
	        Employee emp = new Employee();
	        emp.setEmployeeDetails(id, name, salary, years);
	        emp.getEmployeeDetails();
	        emp.getLoanEligibility();

	        scanner.close();
	    }
	}

