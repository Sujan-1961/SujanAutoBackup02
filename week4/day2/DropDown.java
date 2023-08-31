package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
             public static void main(String[] args) {
            	 EdgeDriver driver = new EdgeDriver();
					driver.get("http://leaftaps.com/opentaps/control/main");
					driver.manage().window().maximize();
					driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
					driver.findElement(By.id("password")).sendKeys("crmsfa");
					driver.findElement(By.className("decorativeSubmit")).click();
					
					String text = driver.findElement(By.tagName("h2")).getText();
					System.out.println(text);
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					
					driver.findElement(By.linkText("CRM/SFA")).click();
					driver.findElement(By.linkText("Leads")).click();
					driver.findElement(By.partialLinkText("Create")).click();
              
				
				WebElement ele = driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']"));	
				Select selectOption = new Select(ele);
				List<WebElement> options = selectOption.getOptions();
				for (int i = 0; i < options.size(); i++) {
					String text1 = options.get(i).getText();
					System.out.println(text1);
				}
				
			}
}
