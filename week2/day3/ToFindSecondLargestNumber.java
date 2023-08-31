package week2.day3;

import java.util.Arrays;

public class ToFindSecondLargestNumber {
            public static void main(String[] args) {
				//delcare an array
            	int[] number= {4,5,6,7,8,1,2,3};
            	//sort the array
            	Arrays.sort(number);
            	//to get array length
            	int a = number.length;
            	
            	
					//print the numbers
					System.out.println(number[a-2]);
				
            	
			}
}
