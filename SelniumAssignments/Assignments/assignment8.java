package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment8 {
	
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\sdet\\Selenium Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().proxy("http://10.98.21.24:8080").setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		try {
			String Name = "Admin";
			String Psword = "admin123";
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(Name);
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(Psword);
			driver.findElement(By.id("btnLogin")).click();
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		driver.findElement(By.linkText("Admin"));
		Thread.sleep(2000);
		String reqtxt = Admin(driver);
		System.out.println(reqtxt);
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Thread.sleep(2000);
		String PIMpage = PIM(driver);
		System.out.println(PIMpage);
		driver.findElement(By.id("menu_dashboard_index")).click();
		Thread.sleep(2000);
		String Dashboardpage = LeaveDashBoard(driver);
		System.out.println(Dashboardpage);
		driver.findElement(By.id("menu_directory_viewDirectory")).click();
		Thread.sleep(2000);
		String Directorypage = Directory(driver);
		System.out.println(Directorypage);
		driver.findElement(By.id("menu_maintenance_purgeEmployee")).click();
		Thread.sleep(2000);
		String Maintainencepage = Maintanence(driver);
		System.out.println(Maintainencepage);
	}
	
	public static String Admin(WebDriver driver) {
		String ReqText = driver.findElement(By.id("menu_admin_UserManagement")).getText();
		return ReqText;
	}

	public static String PIM(WebDriver driver) {
		String ReqText = driver.findElement(By.id("menu_pim_viewEmployeeList")).getText();
		return ReqText;
	}

	public static String LeaveDashBoard(WebDriver driver) {
		String ReqText = driver.findElement(By.id("menu_dashboard_index")).getText();
		return ReqText;
	}

	public static String Directory(WebDriver driver) {
		String ReqText = driver.findElement(By.id("menu_directory_viewDirectory")).getText();
		return ReqText;
	}

	public static String Maintanence(WebDriver driver) {
		String ReqText = driver.findElement(By.id("menu_maintenance_purgeEmployee")).getText();
		return ReqText;
	}
}
