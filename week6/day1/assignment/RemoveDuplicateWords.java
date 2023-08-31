package week6.day1.assignment;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateWords {
	     public static void main(String[] args) {
	    	 String text = "I know you that you won't go anywhere";
	 		String[] split=text.split(" ");
	 		Set<String> sentence=new TreeSet<String>();
	 		for(int i=0;i<split.length;i++) {
	 			sentence.add(split[i]);
	 		}
	 		System.out.println(sentence);
		}
}
