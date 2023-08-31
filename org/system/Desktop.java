package org.system;

//using single inheritance
public class Desktop extends Computer{
            public void desktopSize(String desktopSize) {
            	System.out.println("The Desktop size is " + desktopSize);
            }
            
            public static void main(String[] args) {
				Desktop desk = new Desktop();
				desk.computerModel("Macintosh");
				desk.desktopSize("Height 35cm, Width 24cm, Depth 28cm, Mass 7.5kg ");
			}
            
}
