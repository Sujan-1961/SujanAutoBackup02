package intervwprepAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
                 public static void main(String[] args) {
					ChromeDriver driver = new ChromeDriver();
					driver.get("https://www.flipkart.com/");
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					
//					driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8903255359");
//					driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
					driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
					driver.findElement(By.linkText("Monitor")).click();
					driver.findElement(By.linkText("DELL S Series 24 inch Full HD IPS Panel Monitor (S2421HNM / S2421HN)")).click();
					
					
					
					
					
					
					
                 }

}