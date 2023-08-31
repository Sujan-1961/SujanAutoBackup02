package week4.day1;

import java.util.Iterator;
import java.util.Scanner;

public class ReverseString {
             public static void main(String[] args) {
            	 //scanner syntax
				Scanner scan = new Scanner(System.in);
				//print the input question
				System.out.println("Enter your input");
				
				//declare variable with scan
				String val = scan.nextLine();
				
				char[] charArray = val.toCharArray();
				for (int i = charArray.length-1;i>=0 ; i--) {
					System.out.println(charArray[i]);
				}		
			}
}
