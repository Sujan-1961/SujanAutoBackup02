package intervwprepAssignment;

import java.util.Scanner;

public class ReverseString {
                    public static void main(String[] args) {
                    	//use the scanner method
                        @SuppressWarnings("resource")
						Scanner input = new Scanner(System.in);
                        
                        //print the enter input text for using scanner method
                        System.out.println("Enter the input");
                        
                        //use next line to print the values in next line
                        String text = input.nextLine();
                        
                        //convert the string to character
                        char[] character = text.toCharArray();
                        
                        
                        //iterate the values
                        for (int i = character.length-1; i >= 0; i--) {
                        	//print the values
							System.out.println(character[i]);
						}
						
					}
}
