package intervwquestionsreturntype;

public class ReturnType {
		public static double forwardMoney(double amount) {
	        // Forward the amount to another person or account
	        // Perform any necessary calculations or operations
	        // Here, let's assume we deduct a 10% processing fee
	        double transferredAmount = amount;
	        return transferredAmount;
	    }
	    public static void main(String[] args) {
	        double amountReceived = 1000;
	        double transferredAmount = forwardMoney(amountReceived);
	        System.out.println("Amount transferred: " + transferredAmount + "rs");
	    }    
	}