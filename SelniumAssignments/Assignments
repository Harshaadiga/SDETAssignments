package SeleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment1 {
	public static void main(String[] args)  throws InterruptedException
	{
		String url = "https://opensource-demo.orangehrmlive.com/";
//		System.setProperty("webdriver.chrome.driver", "C:\\sdet\\Selenium Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().proxy("http://").setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
		driver.manage().window().maximize();
  		System.out.println("Url "+url+" opened successfully");
 		driver.close();
	}
}
