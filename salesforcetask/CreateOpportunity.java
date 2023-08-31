package salesforcetask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateOpportunity {
                 public static void main(String[] args) throws InterruptedException {
					EdgeDriver driver  = new EdgeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					driver.get("https://qeagle-dev-ed.my.salesforce.com/");
					driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
					driver.findElement(By.id("password")).sendKeys("Leaf@123");
					driver.findElement(By.id("Login")).click();
					driver.findElement(By.xpath("//button[@class='slds-button slds-icon-waffle_container slds-context-bar__button slds-button forceHeaderButton salesforceIdentityAppLauncherHeader']")).click();
					driver.findElement(By.xpath("//button[@class='slds-button'][1]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//p[text()='Sales']")).click();
					
					WebElement ele = driver.findElement(By.xpath("//span[text()='Opportunities']"));
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].click();", ele);
					
					driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();
					driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).sendKeys("Sales Automation by Sujan");
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).click();
					driver.findElement(By.xpath("//span[text()='31']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']")).click();
					Thread.sleep(2000);
//					try {
//					     driver.findElement(By.xpath("//span[text()='Needs Analysis']")).click();
//					  } catch (Exception e) {
//					     JavascriptExecutor executor = (JavascriptExecutor) driver;
//					     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[text()='Needs Analysis']")));
//					  }
					driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[text()='Save']")).click();
					
					
				}
                 
}
