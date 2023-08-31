package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetFrameForW3Schools {
                 public static void main(String[] args) throws InterruptedException {
					ChromeOptions option  = new ChromeOptions();
					option.addArguments("-disable-notifications");
					ChromeDriver driver = new ChromeDriver();
					driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					Thread.sleep(2000);
					driver.switchTo().frame("iframeResult");
					driver.findElement(By.xpath("//button[text()='Try it']")).click();
					driver.switchTo().alert().sendKeys("Darwin");
					driver.switchTo().alert().accept();
					String text = "User cancelled the prompt.";
				    String text2 = driver.findElement(By.xpath("//p[@id='demo']")).getText();
                       if (text2.equals(text)) {
						System.out.println("It isn't verified");
					} else {
                              System.out.println("It is verified");
					}
				}
}
