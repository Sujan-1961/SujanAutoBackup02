package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ByTheValueFrames {
                     public static void main(String[] args) throws InterruptedException {
                    	 ChromeOptions option = new ChromeOptions();
                    	 option.addArguments("--disable-notifications");
						ChromeDriver driver = new ChromeDriver();
						driver.get("https://buythevalue.in/");
						driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
						Thread.sleep(2000);
						driver.findElement(By.id("com-hextom-smartpushmarketing-modal-allow-modal")).click();
						driver.findElement(By.partialLinkText("URBAN")).click();
					}
}
