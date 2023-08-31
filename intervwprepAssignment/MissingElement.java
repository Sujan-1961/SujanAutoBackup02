package intervwprepAssignment;

public class MissingElement {
                      public static void main(String[] args) {
						//declare a variable
                    	  int[] num = {2,5,6,8,9,1,3,4};
                    	  
                    	  //get the size of the input and plus one
                    	  int n = num.length+1;
                    	  
                    	  //now add n and 1 multiply them and divide the value by 2
                    	  int sum = n*(n+1)/2;
                    	  
                    	  //iterate the values
                    	  for (int i = 0; i < num.length; i++) {
                    		  //minus the values of num with the sum
							sum=sum-num[i];
							
							
						}//now print the missing elements
                    	  System.out.println(sum);
					}
} 
