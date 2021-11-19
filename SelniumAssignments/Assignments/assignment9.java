package SeleniumAssignment;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment9 {
	public static void main(String[] args) throws InterruptedException 
	{
//		System.setProperty("webdriver.chrome.driver", "C:\\sdet\\Selenium Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().proxy("http://10.98.21.24:8080").setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		System.out.println("Minimize chrome driver environment.");
		driver.manage().window().setPosition(new Point(0, -1000));
		Thread.sleep(5000);
		System.out.println("Minimized chrome browser.");
	    driver.close();
	}
}
