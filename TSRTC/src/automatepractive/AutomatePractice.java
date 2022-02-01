package automatepractive;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.*;


public class AutomatePractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//http://automationpractice.com/index.php
    System.setProperty("webdriver.chrome.driver","E:\\NewWorkspace\\lib\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://automationpractice.com/index.php");
    
    driver.manage().window().maximize();
    driver.findElement(By.className("login")).click();
    WebElement username=driver.findElement(By.id("email_create"));
    username.sendKeys("daanamma986@gmail.com");
    Thread.sleep(2000);
    driver.findElement(By.id("SubmitCreate")).click();
    //
    WebElement radio = driver.findElement(By.xpath("//input[@value='1']"));  
    radio.click();
    driver.findElement(By.id("customer_firstname")).sendKeys("danam");
    driver.findElement(By.id("customer_lastname")).sendKeys("maroju");
    driver.findElement(By.id("passwd")).sendKeys("sofa56798");
  
	}
	}

