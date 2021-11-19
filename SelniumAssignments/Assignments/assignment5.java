package SeleniumAssignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment5 {
	static Properties prop;

	public static void main(String[] args) throws IOException, InterruptedException {

		String propsFileLoc = "C:\\Users\\adigah\\eclipse-workspace\\com.broadridge.sdet\\src\\main\\resources\\application.properties";
		FileInputStream fileLoc = new FileInputStream(propsFileLoc);
		prop = new Properties();
		prop.load(fileLoc);
		System.setProperty("webdriver.chrome.driver", "C:\\sdet\\Selenium Driver\\chromedriver.exe");
//		WebDriverManager.chromedriver().proxy("http://").setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		String uname = prop.getProperty("username");
		String upswd = prop.getProperty("password");

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(upswd);
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/h1[1]")).isDisplayed();
		System.out.println("Login success");
		driver.findElement(By.linkText("Admin")).click();
		driver.close();
	}
}
