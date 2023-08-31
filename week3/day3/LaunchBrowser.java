package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {
                  public static void main(String[] args) {
					ChromeDriver driver = new ChromeDriver();
					driver.get("http://leaftaps.com/opentaps/control/main");
					driver.manage().window().maximize();
					driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
					driver.findElement(By.id("password")).sendKeys("crmsfa");
					driver.findElement(By.className("decorativeSubmit")).click();
					
					String text = driver.findElement(By.tagName("h2")).getText();
					System.out.println(text);
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					
					driver.findElement(By.linkText("CRM/SFA")).click();
					driver.findElement(By.linkText("Leads")).click();
					driver.findElement(By.partialLinkText("Create")).click();
					driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Kratos Industries");
					driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sujan");
					driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sujan");
					driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Darwin");
					driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("D");
					driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
					driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
					driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("2,00,000");
					driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("800");
					driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("4055");
					driver.findElement(By.id("createLeadForm_description")).sendKeys("Create a Lead");
					driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Nothing");
					driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("SPDS");
					driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
					driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("125");
					driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9888020345");
					driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sujan93@gmail.com");
					driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("101");
					driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("dilip");
					driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://dilip.com");
					driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Sujan");
					driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("3/275,kavignar street, chennai.");
					driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Dilip");
					driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("4/324,porur,chennai");
					WebElement location = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
					Select personLocation = new Select(location);
					personLocation.selectByVisibleText("New York");
					driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
					driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600125");
					driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("2");
					driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			
				}
}
