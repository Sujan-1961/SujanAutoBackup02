package oopzconcept;

public class OverridingSubClass extends OverridingSuperClass{
	public void makeSound () {
		System.out.println("it make the sound");
	}
	
	public static void main(String[] args) {
		OverridingSubClass method = new OverridingSubClass();
		//OverridingSuperClass method2 = new OverridingSuperClass();
		method.makeSound();
		//method2.makeSound();
	}
}
