package week3.day1;

public class Count {
            public static void main(String[] args) {
            	 //declare a string input
            	int count = 0;
   	         String name  = "Hexaware";
   	         //convert the String into character
   	         //Initialize the count variable as 0
   	         char[] characterLength= name.toCharArray();
   	         //Iterate the characters
   	         for(int i=0; i<characterLength.length;i++)
   	         {
   	        	 if(characterLength[i]== 'e')
   	        		 count++;
   	         }System.out.println(count);
   	         
   	         
   	         
   	         
                //If it is a match, increase the count variable
   	         //print the count
			}
}
