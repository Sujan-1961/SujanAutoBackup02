package week2.day1.assignment;

public class Calculator {
         public void additionTwoNumber(int a, int b) {
        	 int c = a+b;
             System.out.println(c);
         }
         
         public void subtractionTwoNumber(int e, int f) {
        	 int g = e-f;
        	 System.out.println(g);
         }
         
         public void multipleTwoNumber(double i, double j) {
        	 double k = i*j;
        	 System.out.println(k);
         }
         
         public void divideTwoNumber(float x, float y) {
        	 float z = x/y;
        	 System.out.println(z);
         }
         
         public static void main(String[] args) {
			Calculator calci = new Calculator();
			calci.additionTwoNumber(45, 78);
			calci.subtractionTwoNumber(89, 56);
			calci.multipleTwoNumber(45.5, 56.9);
			calci.divideTwoNumber(5.9f, 2.2f);
		}
}
