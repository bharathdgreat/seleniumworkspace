package busSearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BusSearch {
	
	public static void main(String[] args) 
	{
		// Firefox Driver
		//System.setProperty("webdriver.gecko.driver", "E:\\NewWorkspace\\lib\\geckodriver.exe");
		//Chrome Driver
		System.setProperty("webdriver.chrome.driver", "E:\\NewWorkspace\\lib\\chromedriver.exe");

		//launch ff
		//WebDriver driver=new FireFoxDriver();
		
		//launch Chrome	
		WebDriver driver=new ChromeDriver();
		//get url
		driver.get("https://www.tsrtconline.in/oprs-web/");
		//max. window
		driver.manage().window().maximize();
		//target on register with us
	
	}

}
