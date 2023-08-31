package week2.day4;

public class InReverseCharInString {
	public static void main(String[] args) {
    	//declare an input
		String name = "Sujan";
		//output should be S,u,j,a,n
		//To find the size of the string
		int characterLength = name.length();
		System.out.println(characterLength);
		//convert the string into character
		char[] charArray = name.toCharArray();
		//iterate the value o to array length
		for (int i = charArray.length-1 ; i >= 0 ; i--) {
			//print the character
			System.out.println(charArray[i]);
		}
		
		String name2 = "sujan";
		String upperCase = name2.toUpperCase();
		System.out.println(upperCase);
		
		String name3 = "SUJAN";
		String lowerCase = name3.toLowerCase();
		System.out.println(lowerCase);
		
	}
}
