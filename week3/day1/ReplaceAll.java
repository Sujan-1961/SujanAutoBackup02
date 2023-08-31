package week3.day1;

public class ReplaceAll {
              public static void main(String[] args) {
				String text = "One year has 3500 minutes in a year";
				String replaceAll = text.replaceAll("[^0-9]", "");
				System.out.println(replaceAll);
				
				char[] charArray = text.toCharArray();
				for (int i = 0; i < charArray.length; i++) {
					
				}
				
			}
}
