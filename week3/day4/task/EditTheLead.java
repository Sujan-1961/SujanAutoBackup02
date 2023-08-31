package week3.day4.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditTheLead {
                    public static void main(String[] args) {
                    	ChromeDriver driver = new ChromeDriver();
                    	//Launch URL "http://leaftaps.com/opentaps/control/login"
    					driver.get("http://leaftaps.com/opentaps/control/login");
    					//maximize the screen
    					driver.manage().window().maximize();
    					
    					//Enter UserName and Password Using Id Locator
    					driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
    					driver.findElement(By.id("password")).sendKeys("crmsfa");
    					// Click on Login Button using Class Locator
    					driver.findElement(By.className("decorativeSubmit")).click();
    					//Click on CRM/SFA Link
    					driver.findElement(By.linkText("CRM/SFA")).click();
    					//Click on lead
    					driver.findElement(By.linkText("Leads")).click();
    					
    					//Click on Create leads
    					driver.findElement(By.partialLinkText("Create")).click();
    					
    					
    					driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Kratos Industries");
    					//Enter the Firstname
    					driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sujan");
    					//Enter the FirstName local
    					driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sujan");
    					//Enter the Last name
    					driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Darwin");
    					//Enter the department name
    					driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
    					//Enter the Description
    					driver.findElement(By.id("createLeadForm_description")).sendKeys("Create a Lead");
    					//Enter the PrimaryEmail
    					driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sujan93@gmail.com");
    					
    					//Select the state/province
    					WebElement location = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
    					Select personLocation = new Select(location);
    					personLocation.selectByVisibleText("New York");
    					
    					//Click on create leads
    					driver.findElement(By.className("smallSubmit")).click();
    					
    					//Click on Edit button
    					driver.findElement(By.linkText("Edit")).click();
    					
    					//Clear the Description Field using .clear()
    					driver.findElement(By.id("updateLeadForm_description")).clear();
    					
    					//Fill ImportantNote Field with Any text
    					driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Have to be experienced");
    					
    					//Click on update button
    					driver.findElement(By.className("smallSubmit")).click();
    					
    					
    					
    					//Get the title
    				    System.out.println("The Title is" + driver.getTitle());
    				    
    				    //confirm the title appears
    				    if(driver.getTitle().contains("View Lead")) {
    				    	System.out.println("I confirm the title as View lead");
    				    } else {
    				    	System.out.println("The title doesnt have the word View Lead");
    				    }	    
					}
}
