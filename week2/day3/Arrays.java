package week2.day3;

public class Arrays {
               public static void main(String[] args) {
            	   //declare an array
				int[] num = {10,20,30,40,50,60,70,80,90,100};
				//given length
				int length = num.length;
				//allocates length from 0 to 99
				for (int i = 0; i < length; i++) {
					//print the numbers
					System.out.println(num[i]);
				}
				for (int i = num.length-1; i >=0 ; i--) {
					System.out.println(num[i]);
				}
			}
}
