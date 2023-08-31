package week3.day1;

public class SplitPractice {
                public static void main(String[] args) {
                	//declare the input
					String text = "I got Backstabbed";
					//initiate the split
					String[] split = text.split(" ");
					@SuppressWarnings("unused")
					int count = 0;
					System.out.println(split.length);
					for (int i = 0; i < split.length; i++) {
						count++;
					}
					
				}
}
