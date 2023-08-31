package week3.day3;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	           public static void main(String[] args) {
	        	   ChromeDriver driver = new ChromeDriver();
					driver.get("https://www.facebook.com/");
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					driver.findElement(By.xpath("//a[text()='Create new account']")).click();
					try {
						driver.findElement(By.name("firstname")).sendKeys("Sujan");
					} catch (NoSuchElementException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					driver.findElement(By.name("lastname")).sendKeys("Darwin");
					WebElement element = driver.findElement(By.id("month"));
					Select selectMonth = new Select(element);
					selectMonth.selectByIndex(4);
					
					WebElement date = driver.findElement(By.id("day"));
					Select personDate = new Select(date);
					personDate.selectByIndex(9);
					
	
			}
}
