package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertLearning {
             public static void main(String[] args) throws InterruptedException {
            	 ChromeOptions option = new ChromeOptions();
            	 option.addArguments("-disable-notifications");
            	 ChromeDriver driver = new ChromeDriver(option);
					driver.get("https://leafground.com/alert.xhtml;");
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					driver.findElement(By.xpath("//span[text()='Show']")).click();
					driver.switchTo().alert().accept();
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
					driver.switchTo().alert().accept();
					driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
					driver.switchTo().alert().sendKeys("Sujan");
					driver.switchTo().alert().accept();
					driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
					driver.switchTo().alert().dismiss();					
			}
}
