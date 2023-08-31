package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
      public static void main(String[] args) {
    	  ChromeDriver driver  = new ChromeDriver();
			driver.get("https://www.leafground.com/checkbox.xhtml");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebElement element = driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));
			element.click();
			boolean selected = element.isSelected();
			if (selected==true) {
				System.out.println("The checkbox is selected");
			} else {
				System.out.println("The checkbox is not selected");
			}
		
	}
}
