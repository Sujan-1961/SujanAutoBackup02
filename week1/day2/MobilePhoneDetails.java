package week1.day2;

public class MobilePhoneDetails {
	
	 public static void main(String[] args) {
     	String mobileBrandName = "Kratos";
     	System.out.println("Whats the Brand name?" + "-" + mobileBrandName);
     	
     	short mobileBranches = 5;
     	System.out.println("How many branches?" + "-" + mobileBranches);
     	
			MobilePhoneDetails kratos = new MobilePhoneDetails ();
			kratos.mobilePhone();
		}	
                
                public void mobilePhone () {
                	String mobileName = "Kratos summer";
                	System.out.println("Whats the Model Name?" + "-" + mobileName);
                	
                	char mobileLogo = 'K';
                	System.out.println("Logo?" + "-" + mobileLogo);
                	
                	short noOfMobilePiece = 40;
                	System.out.println("Number of pieces?" + "-" + noOfMobilePiece);
                	
                	int modelNumber = 129873465;
                	System.out.println("Whats the Model Number?" + "-" + modelNumber);
                	
                	long mobileImeiNumber = 8615680301980001L;
                	System.out.println("Imei Number?" + "-" + mobileImeiNumber);
                	
                	float mobilePrice = 78999.99F;
                	System.out.println("Whats the price?" + "-" + mobilePrice);
                	
                	boolean isDamaged = false;
                	System.out.println("The Phone is Damaged" + "-" + isDamaged);
                }
                
}
