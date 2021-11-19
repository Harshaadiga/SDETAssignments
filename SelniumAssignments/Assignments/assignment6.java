package SeleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment6 {
	@Test
	public void beforeSuiteTest() {
		System.out.println("before Suite execution");
	}

	@BeforeSuite
	public void before_suite() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\sdet\\Selenium Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().proxy("http://").setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.close();
	}
}
