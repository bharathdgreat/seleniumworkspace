package apsrtc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;




public class Apsrtc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\NewWorkspace\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();

		boolean name = driver.findElement(By.className("user")).isDisplayed();
				
		if(name)
		{
			driver.findElement(By.className("user")).click();
		}
		Thread.sleep(1000);
		driver.findElement(By.id("userName")).sendKeys("bharathdgreat");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Bharath12");
		Thread.sleep(1000);
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		Select gender = new Select(driver.findElement(By.id("genderId")));		
	    gender.selectByVisibleText("FEMALE");
	    Thread.sleep(1000);
		Select nationality = new Select(driver.findElement(By.id("nationalityId")));		
        nationality.selectByVisibleText("NRI");
		}

	}


