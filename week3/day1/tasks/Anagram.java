package week3.day1.tasks;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		//declare inputs
		String name1 = "mani";
		String name2 = "inam";
		
		// check if length is same
		if(name1.length()==name2.length()) {
			// convert strings to char array
			char[] charArray1 = name1.toCharArray();
			char[] charArray2 = name2.toCharArray();
			
			// sort the char array
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			// if sorted char arrays are same
		      // then the string is anagram
			boolean result = Arrays.equals(charArray1, charArray2);
			
			if(result) {
				//print the result
				System.out.println(name1 + " and " + name2 + " are anagram");
			} else {
				System.out.println(name2 + "and" + name2 + "not anagram");
			}
		}
	}
}
