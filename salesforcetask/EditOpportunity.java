package salesforcetask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class EditOpportunity {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver  = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://qeagle-dev-ed.my.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='slds-button slds-icon-waffle_container slds-context-bar__button slds-button forceHeaderButton salesforceIdentityAppLauncherHeader']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='slds-button'][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Sales Automation by Sujan",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath(""));
//		WebElement dropp = driver.findElement(By.xpath("//span[text()='Show more actions']"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(dropp).perform();
//		dropp.click();
//		Thread.sleep(6000);
//		WebElement edit = driver.findElement(By.xpath("(//span[@class='slds-icon_container slds-icon-utility-down'])[1]//following::lightning-primitive-icon"));
//		Actions action = new Actions(driver);
//		action.moveToElement(edit).perform();
//		edit.click();


	}
}

