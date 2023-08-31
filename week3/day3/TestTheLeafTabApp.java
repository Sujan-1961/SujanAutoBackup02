package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTheLeafTabApp {
                public static void main(String[] args) {
                	ChromeDriver driver = new ChromeDriver();
					driver.get("http://leaftaps.com/opentaps/control/main");
					driver.manage().window().maximize();
					driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
					driver.findElement(By.id("password")).sendKeys("crmsfa");
					driver.findElement(By.className("decorativeSubmit")).click();
					
					String text = driver.findElement(By.tagName("h2")).getText();
					System.out.println(text);
					
					driver.findElement(By.linkText("CRM/SFA")).click();
					driver.findElement(By.linkText("Leads")).click();
					driver.findElement(By.partialLinkText("Create")).click();
					
					driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
					driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Sujan");
					driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Darwin");
					
					driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
					driver.switchTo().frame(2);
				}
}
