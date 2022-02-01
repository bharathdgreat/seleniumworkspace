package redbus;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedbusLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\NewWorkspace\\lib\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.com");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.quit();
		
	}

}