package week3.day1.tasks;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {
   	 //declare array input with variable a
		int a[] = {10,11,12,13,14,11,16,13,18,12,20};
		//to find the size of the array input
		int b = a.length;
		//iterate the values
		for (int i = 0; i < b; i++) 
			for (int j = i+1; j < b; j++) {
				if(a[i]==a[j])
					//print the values
					System.out.println(a[i]);
				
				
			}
	}
}
  