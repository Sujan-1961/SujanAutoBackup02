package week3.day4.task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcmeWebsite {
	 public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			//Launch URL https://acme-test.uipath.com/login
			driver.get("https://acme-test.uipath.com/login");
			//maximize the screen
			driver.manage().window().maximize();
			//Enter the email id
			driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
			//Enter the password
			driver.findElement(By.id("password")).sendKeys("leaf@12");
			
			//Click login button
			driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
			
			//get the title of the page
			System.out.println("The title of the page is" + driver.getTitle());
			
			//Click on logout
			driver.findElement(By.partialLinkText("Log")).click();
			
			//close the browser
			driver.close();
			
			
		}
}
