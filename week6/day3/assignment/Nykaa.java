package week6.day3.assignment;




import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class Nykaa {
                 public static void main(String[] args) throws InterruptedException {
                	 ChromeOptions options=new ChromeOptions();
                		options.addArguments("start-Maximized" , "--remote-allow-origins=*" );
                		ChromeDriver driver=new ChromeDriver(options);
                		driver.get("https://www.nykaa.com/");
                		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
                		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
                		WebElement brand = driver.findElement(By.xpath("//div[@id='list_topbrands']//following::div[6]/a"));
                		Actions builder = new Actions(driver);
                		builder.moveToElement(brands).click(brand).perform();
                		Thread.sleep(2000);
                		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
                		driver.findElement(By.xpath("//div[@class='control-indicator radio '] //following::div[4]")).click();
                		driver.findElement(By.xpath("//span[text()='Category']")).click();
                		Thread.sleep(2000);
                		driver.findElement(By.xpath("//span[text()='Hair']")).click();
                		Thread.sleep(2000);
                		driver.findElement(By.xpath("//div[@class=' css-b5p5ep']//span[text()='Hair Care']")).click();
                		Thread.sleep(2000);
                		driver.findElement(By.xpath("//div[@class='control-value']//span[text()='Shampoo']")).click();
                		Thread.sleep(2000);
                		driver.findElement(By.xpath("//div[@class='filter-open css-1kwl9pj']//span[text()='Concern']")).click();
                		Thread.sleep(2000);
                		driver.findElement(By.xpath("//div[@class='control-value']//span[text()='Color Protection']")).click();
                		
                		
                		
                		
                 }
}