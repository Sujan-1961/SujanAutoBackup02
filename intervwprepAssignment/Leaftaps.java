package intervwprepAssignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leaftaps {
                 public static void main(String[] args) {
					ChromeDriver driver = new ChromeDriver();
					driver.get("http://leaftaps.com/opentaps/control/login");
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
					driver.findElement(By.id("password")).sendKeys("crmsfa");
					driver.findElement(By.className("decorativeSubmit")).click();
					
					String text = driver.findElement(By.tagName("h2")).getText();
					System.out.println(text);
					driver.findElement(By.partialLinkText("CRM/SFA")).click();
					driver.findElement(By.linkText("Leads")).click();
					driver.findElement(By.partialLinkText("Create Lead")).click();
					driver.findElement(By.id("createLeadForm_companyName")).sendKeys("teastleaf");
					driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sujnnn");
					driver.findElement(By.id("createLeadForm_lastName")).sendKeys("darwin");
					WebElement element = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
					Select select = new Select(element);
					List<WebElement> options = select.getOptions();
					for (int i = 0; i < options.size(); i++) {
						String text1 = options.get(i).getText();
						System.out.println(text1);
					}
					driver.findElement(By.className("smallSubmit")).click();
					
					
				}
}
