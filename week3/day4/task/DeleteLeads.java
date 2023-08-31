package week3.day4.task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeads {
	public static void main(String[] args) {
 	   ChromeDriver driver = new ChromeDriver();
    	 //Launch URL "http://leaftaps.com/opentaps/control/login"
			driver.get("http://leaftaps.com/opentaps/control/login");
			//maximize the screen
			driver.manage().window().maximize();
			//Enter UserName and Password Using Id Locator
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			// Click on Login Button using Class Locator
			driver.findElement(By.className("decorativeSubmit")).click();
			
			String text = driver.findElement(By.tagName("h2")).getText();
			System.out.println(text);
			
			//Click on CRM/SFA Link
			driver.findElement(By.linkText("CRM/SFA")).click();
			//Click on leads
			driver.findElement(By.linkText("Leads")).click();
			//Click on find leads
			driver.findElement(By.linkText("Find Leads")).click();
			//Click on phone 
			driver.findElement(By.linkText("Phone")).click();
			
			//Clear Area code
			driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
			
			//Enter Area code
			driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("91");
			
			//Enter country code 
			driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("125");
			
            //Enter phone number 3
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9888020345");
		    //Click find leads button
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			
			//Capture lead ID of First Resulting lead
			String text1=driver.findElement(By.xpath("//a[text()='14491']")).getText();
			
			System.out.println(text1);
			
			//Click First Resulting lead
			//driver.findElement(By.xpath("//a[text()='14491']")).click();
			
			//Click Delete
			//driver.findElement(By.xpath("//a[text()='Delete']")).click();
			
			//Click Find leads
			//driver.findElement(By.linkText("Find Leads")).click();
			
			//Enter captured lead ID
			//driver.findElement(By.xpath("//input[@name='id']")).sendKeys("14491");
			
			//Click find leads button
			//driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		    
		    //Verify message "No records to display" in the Lead List. This message confirms the successful deletion
			//System.out.println("No records to display");
		    //Close the browser (Do not log out)
			//driver.close();
			
	}
}
