package week3.day4.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
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
     					
     					String text = driver.findElement(By.tagName("h2")).getText();
     					System.out.println(text);
     					
     					//Click on CRM/SFA Link
     					driver.findElement(By.linkText("CRM/SFA")).click();
     					//Click on leads
     					driver.findElement(By.linkText("Leads")).click();
     					//Click on create contacts
     					driver.findElement(By.linkText("Contacts")).click();
     					//Click on create contacts
     					driver.findElement(By.linkText("Create Contact")).click();
     					//Enter the first name
     					driver.findElement(By.id("firstNameField")).sendKeys("Sujan");
     					//Enter the first name local
    					driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Sujan");
    					//Enter the last name
    					driver.findElement(By.id("lastNameField")).sendKeys("Darwin");
    					//Enter the last name local
    					driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("D");
    					//Enter the department name
    					driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
    					//Enter the description name
    					driver.findElement(By.id("createContactForm_description")).sendKeys("Create a Lead");
    					//Enter the primary email
    					driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sujan93@gmail.com");
    					
    					//Select the state/province
    					WebElement location = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
    					Select personLocation = new Select(location);
    					personLocation.selectByVisibleText("New York");
    					
    					//Click on create contact
    					driver.findElement(By.className("smallSubmit")).click();
    					
    					//click on edit button
    					driver.findElement(By.linkText("Edit")).click();
    					
    					//clear the description
    					driver.findElement(By.id("updateContactForm_description")).clear();
    					
    					//enter the important note
    					driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Should be experienced");
    					
    					//click on update button using x path
    					driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
    					
    					//get the title of the resulting page
    					System.out.println("The title is" + driver.getTitle());
    					
    					//prove the title is viewed or not
    					if(driver.getTitle().contains("View Contact")) {
    						System.out.println("I confirm the title as View Contact");
    					} else {
    						System.out.println("The title doesnt have the word View Contact");
    					}
    					
    					
				}
}
