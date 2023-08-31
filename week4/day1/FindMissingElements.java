package week4.day1;

import java.util.Arrays;

public class FindMissingElements {
                 public static void main(String[] args) {
                	 //declare variable
					int[] num = {1,2,4,5};
					
					//use array sort
					Arrays.sort(num);
					
					//get size of the array and plus 1
					int n = num.length+1;
					
					//then sum then as nxn+1 divided by 2
					 int sum = n*(n+1)/2;
					 
					 //iterate
					 for (int i = 0; i < num.length; i++) {
						 //minus sum by num of array i
						sum = sum-num[i];
						//print the values
						
					}System.out.println(sum);
				}
}
