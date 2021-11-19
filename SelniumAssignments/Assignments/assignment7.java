package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment7 {
	
	WebDriver driver;
	
	@BeforeTest()
	public void beforetests() {
		try {
//			System.setProperty("webdriver.chrome.driver", "C:\\sdet\\Selenium Driver\\chromedriver.exe");
			WebDriverManager.chromedriver().proxy("http://10.98.21.24:8080").setup();			
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(1000);
			driver.manage().window().maximize();
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	@Test(priority=1)
	public void testpriority1() {
		String  name = "Admin";
		String  psword = "admin123";
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(psword);
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@AfterTest()
	public void Logout()
	{
		driver.quit();
	}
}
