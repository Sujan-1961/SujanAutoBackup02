package intervwprepAssignment;

public class PrintDuplicate {
                    public static void main(String[] args) {
						//declare a variable with input
                    	int[] number = {11,22,33,44,55,66,22,77,11};
                    	
                    	//declare a variable with zero as input
                    	int b = number.length;
                    	
                        //iterate the values
                    	for (int i = 0; i < b; i++) {
                    		//implement another iteration
                    		for (int j = i+1; j < b; j++) {
                    			//use if condition to find the duplicate value
								if (number[i]==number[j]) {
									
									//print the duplicates
									System.out.println("The duplicate number is "+number[i]);
								}
							}
							
						}
					}
}
	