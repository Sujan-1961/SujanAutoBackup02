package intervwprepAssignment;

public class Palindrome {
                   public static void main(String[] args) {
					//declare a variable with inputs
                	   String text = "madam";
                	   
                	   //declare another variable with empty input
                	   String a = "";
                	   
                	   //covert the string to char array
                	   char[] character = text.toCharArray();
                	   
                	   //iterate the values
                	   for (int i =character.length-1; i >=0 ; i--) {
                		   //sum the values
						a = a+character[i];
						
						//print the values
						System.out.println(a);
					}
                	   //compare a with text to see whether the condition is true or false
                	   if (a.equals(text)) {
                		   
						System.out.println("The Given String is palindrome");
					} else {
                          System.out.println("The Given String is not a palindrome");
					}          	   
				}	               
}
