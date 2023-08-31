package week2.day1;

public class Calculator {
         public static void main(String[] args) {
			Calculator calc = new Calculator();
			calc.add();
			calc.sub();
			calc.div();
			calc.mult();
		}
         
         public void add() {
        	 int a = 26;
        	 int b = 34;
        	 int c = a+b;
        	 System.out.println(c);
         }
         
         public void sub() {
        	 int a = 35;
        	 int b = 89;
        	 int c = a-b;
        	 System.out.println(c);
         }
         
         public void div() {
        	 int x = 460;
        	 int y = 89;
        	 int z = x/y;
        	 System.out.println(z);
         }
         
         public void mult() {
        	 int mult1 = 23;
        	 int mult2 = 67;
        	 int mult3 = mult1*mult2;
        	 System.out.println(mult3);
         }
}
