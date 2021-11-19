package SeleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {
	public static void main(String[] args)  throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\sdet\\Selenium Driver\\chromedriver.exe");
//		WebDriverManager.chromedriver().proxy("http://").setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
  		String Title = driver.getTitle();
  		System.out.println("Application title is: " + Title);
 		driver.close();
	}
}
