
package javaassignments;

import java.util.*;

class TravelAgencies {
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;

    public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    public int getRegNo()
    {
    	return regNo; 
    }
    public String getAgencyName()
    {  
    	return agencyName; 
     }
    public String getPackageType()
    { 
    	return packageType;
    }
    public int getPrice() {
    	return price;
    	}
    public boolean isFlightFacility()
    { 
    	return flightFacility; 
    	}
    class solution{
    	public static int findAgencyWithHighestPackagePrice(TravelAgencies[] agencies) {
    		int maxprice=Integer.MAX_VALUE;
    		for(TravelAgencies agency:agencies) {
    			if(agency.getPrice()>maxprice) {
    				maxprice=agency.getPrice();
    			}
    		}
    		return maxprice;
    	}
    	public static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies[] agencies, int regNo, String packageType) {
            for (TravelAgencies agency : agencies) {
                if (agency.isFlightFacility() && agency.getRegNo() == regNo && 
                    agency.getPackageType().equalsIgnoreCase(packageType)) {
                    return agency;
                }
            }
            return null;
    	}
    	public static void main(String args[]) {
    		TravelAgencies[] agencies=new TravelAgencies[4];
    		agencies[0]=new TravelAgencies(101,"Gobibo","Gold",500000,true);
    		agencies[1]=new TravelAgencies(102,"myyatra","Platinum",900000,true);
    		agencies[2]=new TravelAgencies(103,"travelbud","Gold",700000,true);
    		agencies[3]=new TravelAgencies(104,"wanderlust","silver",300000,false);
    		System.out.println(findAgencyWithHighestPackagePrice(agencies));
    		 TravelAgencies result = agencyDetailsForGivenIdAndType(agencies, 103, "Gold");
    	        if (result != null) {
    	            System.out.println(result.getAgencyName() + ":" + result.getPrice());
    	}
    }

}
}