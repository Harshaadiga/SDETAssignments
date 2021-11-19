package SeleniumAssignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment11_12 {

	public static WebDriver driver;
	OrangePages OrangeOR;
	public static FileInputStream fileLoc;
	public static Properties prop;

	@BeforeClass
	public void setUp() {
		System.out.println("Started execution");
		try {
			fileLoc = new FileInputStream("src/main/resources/application.properties");
			prop = new Properties();
			prop.load(fileLoc);
		} catch (Exception e) {
			e.printStackTrace();
		}

//		System.setProperty("webdriver.chrome.driver", "C:\\sdet\\Selenium Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().proxy("http://10.98.21.24:8080").setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}

	@Test(priority = 1)
	public void LogInApp() throws Exception {
		String name = prop.getProperty("username");
		String psword = prop.getProperty("passwd");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(psword);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
	}
	
	@Test(priority=2)
	public void TestScreenshot() throws Exception {
		String DashBoardHeader = (OrangeOR).getDashBoardConfirmation();
		boolean result = DashBoardHeader.equalsIgnoreCase("Dashboard");
		
		if (result) {
			Thread.sleep(1000);
			captureScreenshot(driver, "Dashboard Passed");
			Assert.assertTrue(true);
			Reporter.log("User is in Dashboard Menu", true);
			;
		} else {
			int i = 1;
			captureScreenshot(driver, "Dashboard Failed Interation = " + i);
			Assert.assertTrue(false);
			Reporter.log("User is NOT in Dashboard Menu", true);
			i++;
		}
	}

	private void captureScreenshot(WebDriver Driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) Driver;
		File Src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(Src, dest);
		System.out.println("Screen shot is captured");
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
