package intervwprepAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartHome {
                  public static void main(String[] args) {
					ChromeDriver driver = new ChromeDriver();
					driver.get("https://www.flipkart.com/");
					driver.findElement(By.name("q")).sendKeys("Mobile");
					driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
					
					
				}
}
