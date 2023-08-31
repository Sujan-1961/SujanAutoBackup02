package week3.day1.tasks;

import java.util.Arrays; 

public class FindMissingElements {
       public static void main(String[] args) {
    	   //declare input
		int[] a = {1,2,3,5,6,7};
		//sort the array inputs
		Arrays.sort(a);
		
		//give some variable with input as 0
		int b=0;
		
		//iterate the values
		for (int i = 0; i < a.length; i++) {
			
			b=b+1;
			if(a[i]!=b) {
				System.out.println(b);
				break;
			}
		}
		} 
	}

