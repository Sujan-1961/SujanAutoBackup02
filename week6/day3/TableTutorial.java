package week6.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TableTutorial {
           public static void main(String[] args) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://erail.in/");
			WebElement from = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
			from.clear();
			from.sendKeys("MAS",Keys.ENTER);
			WebElement to = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
			to.clear();
			to.sendKeys("MDU",Keys.ENTER);
			//driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"))
			
			
		}
}
