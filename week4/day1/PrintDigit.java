package week4.day1;

public class PrintDigit {
                public static void main(String[] args) {
                	//declare a variable
					String text = "sujan1961@gmail.com";
					
					//replace only digits using replaceAll
					String replaceAll = text.replaceAll("[^0-9]", "");
					
					
					//print the digit values
					System.out.println(replaceAll);
					
					
				}
}
