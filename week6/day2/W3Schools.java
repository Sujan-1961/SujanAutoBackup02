package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Schools {
            public static void main(String[] args) {
				ChromeDriver driver  = new ChromeDriver();
				driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
				driver.manage().window().maximize();
				driver.switchTo().frame("iframeResult");
				driver.findElement(By.xpath("//button[text()='Try it']")).click();
				driver.switchTo().alert().sendKeys("Sujan");
				driver.switchTo().alert().accept();	
			}
}
