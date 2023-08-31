package week1.day2;

public class TwoWheeler {
       public static void main(String[] args) {
    	   String companyName = "TVS";
    	   System.out.println("Whats the company name" + "-" + companyName);
    	   
		TwoWheeler bike = new TwoWheeler ();
		bike.twoWheeler();
	}
       public void twoWheeler() {
    	int noOfWheels = 2;
    	System.out.println("No Of Wheels in Bike" + "-" + noOfWheels);
    	
   		short noOfMirrors = 2;
   		System.out.println("No Of Mirrors in Bike" + "-" + noOfMirrors);
   		
   		long chassisNumber = 321459876L;
   		System.out.println("Chassis Number of the Bike" + "-" + chassisNumber);
   		
   		boolean isPunctured = false;
   		System.out.println("The tire is punctured" + "-" + isPunctured);
   		
   		String bikeName = "Ntorq RTR";
   		System.out.println("Whats the bike name?" + "-" + bikeName);
   			
   		double runningKM = 2510.99;	
   		System.out.println("Whats the running km of the bike" + "-" + runningKM);
       }	
}