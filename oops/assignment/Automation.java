package oops.assignment;

public class Automation extends MultipleLanguage {

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
		
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java");
		
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby");
		
	}
	public static void main(String[] args) {
		Automation print = new Automation();
		print.Selenium();
		print.Java();
		print.python();
		print.ruby();
	}
                  
}
