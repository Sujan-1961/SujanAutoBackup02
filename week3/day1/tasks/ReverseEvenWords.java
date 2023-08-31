package week3.day1.tasks;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String text = "I am a software tester";
		String[] split = text.split(" ");
				for (int i = 0; i < split.length; i++)	
			
					{
					
					if(i%2==1) {
						char[] character = split[i].toCharArray();  
						for(int j=character.length-1;j>=0;j--) {
							System.out.print(character[j]);
						}
						
					}
					else {
						
						System.out.print(split[i]+" ");
						System.out.println(" ");
					}
				}
				
	}
}
