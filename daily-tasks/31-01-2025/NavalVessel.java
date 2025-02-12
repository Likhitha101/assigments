package javaassignments;
import java.util.Scanner;
public class NavalVessel  {
	    private int vesselId;
	    private String vesselName;
	    private int noOfVoyagesPlanned;
	    private int noOfVoyagesCompleted;
	    private String purpose;
	    private String classification;

	    public NavalVessel(int vesselId, String vesselName, int noOfVoyagesPlanned, 
	                       int noOfVoyagesCompleted, String purpose) {
	        this.vesselId = vesselId;
	        this.vesselName = vesselName;
	        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
	        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
	        this.purpose = purpose;
	    }

	    public int getVesselId() {
	        return vesselId;
	    }

	    public void setVesselId(int vesselId) {
	        this.vesselId = vesselId;
	    }

	    public String getVesselName() {
	        return vesselName;
	    }

	    public void setVesselName(String vesselName) {
	        this.vesselName = vesselName;
	    }

	    public int getNoOfVoyagesPlanned() {
	        return noOfVoyagesPlanned;
	    }

	    public void setNoOfVoyagesPlanned(int noOfVoyagesPlanned) {
	        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
	    }

	    public int getNoOfVoyagesCompleted() {
	        return noOfVoyagesCompleted;
	    }

	    public void setNoOfVoyagesCompleted(int noOfVoyagesCompleted) {
	        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
	    }

	    public String getPurpose() {
	        return purpose;
	    }

	    public void setPurpose(String purpose) {
	        this.purpose = purpose;
	    }

	    public String getClassification() {
	        return classification;
	    }

	    public void setClassification(String classification) {
	        this.classification = classification;
	    }
	}

	class Solution {

	    public static double findAvgVoyagesByPct(NavalVessel[] vessels, int percentage) {
	        int count = 0;
	        int totalVoyages = 0;

	        for (NavalVessel vessel : vessels) {
	            int voyagePercentage = (vessel.getNoOfVoyagesCompleted() * 100) / vessel.getNoOfVoyagesPlanned();
	            if (voyagePercentage >= percentage) {
	                totalVoyages += vessel.getNoOfVoyagesCompleted();
	                count++;
	            }
	        }

	        if (count == 0) {
	            return 0;
	        }

	        return (double) totalVoyages / count;
	    }

	    public static NavalVessel findVesselByGrade(NavalVessel[] vessels, String purpose) {
	        for (NavalVessel vessel : vessels) {
	            if (vessel.getPurpose().equalsIgnoreCase(purpose)) {
	                int voyagePercentage = (vessel.getNoOfVoyagesCompleted() * 100) / vessel.getNoOfVoyagesPlanned();

	                if (voyagePercentage == 100) {
	                    vessel.setClassification("Star");
	                } else if (voyagePercentage >= 80) {
	                    vessel.setClassification("Leader");
	                } else if (voyagePercentage >= 55) {
	                    vessel.setClassification("Inspirer");
	                } else {
	                    vessel.setClassification("Striver");
	                }

	                return vessel;
	            }
	        }
	        return null;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        NavalVessel[] vessels = new NavalVessel[4];
	        for (int i = 0; i < 4; i++) {
	            int vesselId = sc.nextInt();
	            sc.nextLine();
	            String vesselName = sc.nextLine();
	            int noOfVoyagesPlanned = sc.nextInt();
	            int noOfVoyagesCompleted = sc.nextInt();
	            sc.nextLine();
	            String purpose = sc.nextLine();
	            vessels[i] = new NavalVessel(vesselId, vesselName, noOfVoyagesPlanned, 
	                                         noOfVoyagesCompleted, purpose);
	        }

	        int percentage = sc.nextInt();
	        sc.nextLine();
	        String purpose = sc.nextLine();

	        double avgVoyages = findAvgVoyagesByPct(vessels, percentage);
	        if (avgVoyages == 0) {
	            System.out.println("No Naval Vessel is available with the specified percentage");
	        } else {
	            System.out.println((int) avgVoyages);
	        }

	        NavalVessel vessel = findVesselByGrade(vessels, purpose);
	        if (vessel == null) {
	            System.out.println("No Naval Vessel is available with the specified purpose");
	        } else {
	            System.out.println(vessel.getVesselName() + "%" + vessel.getClassification());
	        }

	        sc.close();
	    }
	}
