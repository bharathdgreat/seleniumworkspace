package paytm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Paytm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\NewWorkspace\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");

	}

}
