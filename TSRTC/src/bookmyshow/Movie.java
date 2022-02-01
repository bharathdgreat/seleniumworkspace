package bookmyshow;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.InputSource;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Movie {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\NewWorkspace\\lib\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.apsrtconline.in/oprs-web/");
	driver.manage().window().maximize();
    driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys("hyderabad");
    List<WebElement> list = driver.findElements(By.xpath("//*[@id='ui-id-1']/li[1]"));
	
	System.out.println("Auto Suggest List ::" + list.size());
	
	for(int i = 0 ;i< list.size();i++)
	{
		System.out.println(list.get(i).getText());
		
		if(list.get(i).getText().equals("HYDERABAD"))
		{
			list.get(i).click();
			break;
		}
	}  
    
	}

}
