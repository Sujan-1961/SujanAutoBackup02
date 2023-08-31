package week2.day4;

public class ChangeNameIntoNumberAndPrintAsOddAndEven {
         public static void main(String[] args) {
        	 //declare the input
			String name = "Changeme";
			//to find the size of the string
			int characterLength = name.length();
			//convert the string into character
			System.out.println(characterLength);
			//iterate the value o to array length
			char[] charArray = name.toCharArray();
			for(int i = 0; i < charArray.length; i++) {
				if(i%2==0) {
					char c = Character.toUpperCase(charArray[i]);
					System.out.println(c);
				} else {
					System.out.println(charArray[i]);
				}
			}
		}
}
