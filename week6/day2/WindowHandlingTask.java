package week6.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingTask {
           public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.irctc.co.in/nget/train-search");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			String title = driver.getTitle();
			System.out.println("parent window" +title);
			driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
			Set <String> openWindow = driver.getWindowHandles();
			List <String> childWindow = new ArrayList <String>(openWindow);
			driver.switchTo().window(childWindow.get(1));
			String title2 = driver.getTitle();
			System.out.println("child window" +title2);
			if (title!=title2) {
				System.out.println("Verified");
			}
			
			
		
		}
}
