package oopzconcept;

public class OverLoading {
        public void answer(int a, int b) {
        	System.out.println(a+b);
        }
        
        public void answer(double a, int b) {
        	System.out.println(a + b);
        	
        }
        
        public final void answer(String a, int b) {
        	System.out.println(a + b);
        }
        
        public static void main(String[] args) {
			OverLoading calc = new OverLoading();
			calc.answer(15, 78);
			calc.answer(38, 98);
			calc.answer("sujan", 67);
		}
}
