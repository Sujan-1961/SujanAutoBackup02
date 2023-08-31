package week6.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {
           public static void main(String[] args) {
        	   ChromeOptions options = new ChromeOptions();
        	  options.addArguments("--disable-notifications","start--maximized", "--incognito", "--headless");
			ChromeDriver driver = new ChromeDriver(options);
			driver.get("https://www.snapdeal.com/");
			WebElement ele = driver.findElement(By.xpath("//span[@class='catText']"));
			Actions builder = new Actions(driver);
			builder.pause(20).moveToElement(ele).perform();
			
           }
}
