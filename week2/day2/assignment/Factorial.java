package week2.day2.assignment;

public class Factorial {
	public static void main(String[] args) {
  	  //declare an integer variable fact as 1
		int fact = 1;
		//declare an input as 5
		//iterate from 1 to your input
		for (int i = 5; i > 1; i--) {
			//multiply from the fact to the iterator variable
			fact = fact*i;
			//end loop
			//print factorial
			System.out.println("The Factorial number is "+fact);
		}
	}
}
