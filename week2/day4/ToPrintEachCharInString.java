package week2.day4;


public class ToPrintEachCharInString {
            public static void main(String[] args) {
            	//declare an input
				String name = "Sujan";
				//output should be S,u,j,a,n
				//To find the size of the string
				int characterLength = name.length();
				//convert the string into character
				System.out.println(characterLength);
				//iterate the value o to array length
				char[] charArray = name.toCharArray();
				for (int i = 0; i < charArray.length; i++) {
					//print the character
					System.out.println(charArray[i]);
				}
				
			}
}
