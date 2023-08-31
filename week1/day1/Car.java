package week1.day1;

public class Car {
	public static void main(String[] args) {
		System.out.println("Get a Skoda vrs mk3");
		Car fourwheeler = new Car ();
		fourwheeler.openTheDoor();
		fourwheeler.getInTheCar();
		fourwheeler.startEngine();
		fourwheeler.adjustTheMirror();
		fourwheeler.adjustTheSeat();
		fourwheeler.switchOnAc();
		fourwheeler.applyBrake();
		fourwheeler.pressTheClutch(); 
		fourwheeler.applyGear();
		fourwheeler.applyAccelerate();
		fourwheeler.releaseTheClutch();
	}
	 
	public void openTheDoor() {
		System.out.println("Open the goddamn door!");
	}
	
	public void getInTheCar() {
		System.out.println("Get in the car");
	}
	
	public void startEngine() {
		System.out.println("Power up the car");
	}
	
	public void adjustTheMirror() {
		System.out.println("Adjust that mirror");
	}
	
	public void adjustTheSeat() {
		System.out.println("Get this seat right");
	}
	
	public void releaseTheClutch() {
		System.out.println("Release the clutch slowly");
	}
	
	public void applyBrake() {
		System.out.println("Brake the car");
	}
	
	public void applyGear() {
		System.out.println("Put it in 1st gear");
	}
	
	public void switchOnAc() {
		System.out.println("Switch on that AC, please");
	}
	
	public void pressTheClutch() 
	{
		System.out.println("Press the Clutch");
	}
		
	public void applyAccelerate() {
		System.out.println("Punch it!");
	}

}
