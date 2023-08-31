package week2.day3;

public class FindIntersection {
         public static void main(String[] args) {
			int[] num1= {1,2,4,5,6,7,8,2};
			int[] num2= {3,12,11,5,6,7,9};
			//output has to be 5,6,7
			//iterate the values 0 to num1length
			for(int i=0; i<num1.length; i++) {
				//iterate the values 0 to num2length
				for(int j=0; j<num2.length; j++)
				{
					//compare if both arrays match	
					
					//print the intersection number
					if(num1[i]==num2[j])
					System.out.println(num1[i]);
					
				}
				
			}
		}
}
