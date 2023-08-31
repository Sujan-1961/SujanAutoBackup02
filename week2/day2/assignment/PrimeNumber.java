package week2.day2.assignment;

public class PrimeNumber {
      public static void main(String[] args) {
    	  //declare an input and assign a value 13
    	  int a = 13;
    	  //declare a boolean variable flag as false
    	  boolean flag = false;
    	  //iterate from 2 to half of the variable
		for (int i = 2; i <= a/2 ; i++) {
			// Divide the input with each for loop variable and check the remainder
			if (a%i==0) {
				// Set the flag as true when there is no remainder
				flag = true;
				// break the iterator
				break;
			}
			// Check the flag (Provide a condition)
			if (flag==false) {
				// Print 'Prime' when the condition matches
				System.out.println("13 is a Prime Number");
			} else {
				// Print 'Not a Prime' when the condition doesn't match 
				System.out.println("13 is not a Prime Number");
			}
		}
	}
}
