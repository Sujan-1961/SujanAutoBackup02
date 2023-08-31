package week2.day1;

public class Calculator1 {
          public void add(int a, int b) {
        	  int c = a+b;
        	  System.out.println(c);
          }
          
          public void sub(int a, int b) {
        	  int c = a-b;
        	  System.out.println(c);
          }
          
          public void mult(int a, int b) {
        	  int c = a*b;
        	  System.out.println(c);
          }
          
          public void div(int a, int b) {
        	  int c = a/b;
        	  System.out.println(c);
          }
          
          public static void main(String[] args) {
			Calculator1 calc = new Calculator1 ();
			calc.add(34, 78);
			calc.sub(98, 78);
			calc.mult(67, 89);
			calc.div(98, 9);
		}
		
}
