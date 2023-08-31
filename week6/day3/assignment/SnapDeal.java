package week6.day3.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SnapDeal {
              public static void main(String[] args) {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("start-Maximized", "--disable-notification");
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.snapdeal.com/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.findElement(By.xpath("//span[@class='catText']")).click();
				driver.findElement(By.xpath("//span[@class='linkTest']")).click();
			}
}
