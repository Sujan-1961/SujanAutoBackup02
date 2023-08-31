package week6.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OrderingMobile {
             public static void main(String[] args) {
				EdgeDriver driver = new EdgeDriver();
				driver.get("https://dev140572.service-now.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//driver.findElement(By.xpath("//input[@id='user_name']/following::input[@id='user_password']")).sendKeys("username", "India@123");
				driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
				driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("P-qQ7@umSYz8");
				driver.findElement(By.xpath("//button[text()='Log in']")).click();
				
				
			}
}
