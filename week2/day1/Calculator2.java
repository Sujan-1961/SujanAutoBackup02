package week2.day1;

public class Calculator2 {
           public int mult(int a, int b) {
        	   int c = a*b;
        			   return c;
           }
           
           public void sub(int total, int b) {
        	   int c = total-b;
        	   System.out.println(c);
           }
           
           public int add(int a, int b) {
        	   int c = a+b;
        	   return c;
           }
           
           public void sub1(int totaal, int b) {
        	   int c = totaal-b;
        	   System.out.println(c);
           }
           
           public static void main(String[] args) {
        	   Calculator2 calc = new Calculator2 ();
			int total = calc.mult(210,390);
			System.out.println(total);
			calc.sub(total, 60);	
			
			int totaal = calc.add(320, 210);
			System.out.println(totaal);
			calc.sub1(totaal, 100);
		}
}
