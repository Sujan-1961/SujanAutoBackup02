package intervwprepAssignment;

public class Occurance {
                     public static void main(String[] args) {
						//declare a Variable
                    	 String text = "Testleaf";
                    	 
                    	 //declare another variable with empty input
                    	 int count = 0;
                    	 
                    	 //convert the string into char array
                    	 char[] character = text.toCharArray();
                    	 
                    	 //iterate the values
                    	 for (int i = 0; i < character.length; i++) {
                    		 //use if condition to check the count of e
                    		 if (character[i]=='e') {
								count++;								
							}	                    		 
						}
                    	 //print the count
                    	 System.out.println(count);
                    	 
                    	 
					}
}
