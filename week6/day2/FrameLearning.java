package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameLearning {
          public static void main(String[] args) {
			ChromeDriver driver  = new ChromeDriver();
			driver.get("https://leafground.com/frame.xhtml");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.switchTo().frame(2);
			driver.switchTo().frame("frame2");
			driver.findElement(By.id("Click")).click();	
		}
}
