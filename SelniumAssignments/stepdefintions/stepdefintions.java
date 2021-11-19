package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import stepdefinitions.OrangePages;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefintions {
	
	OrangePages  OrangeOR;
	WebDriver driver;
	
	@Before(value = "@Background")
	public void setUp() throws InterruptedException {
		System.out.println("I am @Before Method");
//		System.setProperty("webdriver.chrome.driver", "C:\\sdet\\Selenium Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().proxy("http://").setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		OrangeOR = new OrangePages(driver);
		driver.close();
	}
	
	@After
	public void tearDown() {
		System.out.println("I am @After Method");
	}
	
	@Given("I am in OrangeHRP Application")
	public void OrangeHRPApplication() throws Throwable {
		String title = driver.getTitle();
		System.out.println(title);
		boolean status = title.contains("Orange");
		Assert.assertTrue(status);
		System.out.println("The user is an orangehrm home page");
	}
	
	@Then("^Login to Application$")
	public void logintoApplication() {
		OrangeOR.setUnameTextFieldInput("Admin");
		OrangeOR.setPwdTextFieldInput("admin123");
		OrangeOR.ClickOnSubmitButton();
	}

	@When("^Dashboard page is available$")
	public void waituntildashboardpage() {
		String Dashboard = OrangeOR.getDashBoardConfirmation();
		System.out.println("User is on"+Dashboard+"Tab");
	}
	
	@Then("^click on Admin Menu$")
	public void clickonAdminMenu() {
		OrangeOR.ClickOnAdminTab();
		String Admin = OrangeOR.getTextOnAdmin();
		System.out.println("User is on"+Admin+"Tab");
	}
	
	@Then("^Click on Job - {string}$")
	public void click_on_Job(String jobtitle) throws InterruptedException {
//		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewJobTitleList");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		WebElement JobMenu = driver.findElement(By.xpath("//a[@id='menu_admin_Job']"));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(JobMenu))).build().perform();
	    actions.moveToElement(JobMenu).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'"+jobtitle+"')]")).click();	
	}
	
	@Then("^Validate the text - {string}$")
	public void validate_text_on_Job_Title(String expectedjobtitle) {
		String actualjobtitle = driver.findElement(By.xpath("//*[@id=\"search-results\"]/div[1]/h1")).getText();
		System.out.println("Job Header text "+actualjobtitle);
		Assert.assertEquals(actualjobtitle, expectedjobtitle);
		System.out.println("User is on"+actualjobtitle+"Menu");
	}
	
	@Then("^Click on Job$")
	public void click_on_Job() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewJobTitleList");
//		Thread.sleep(3000);
	}

	@Then("^validate text on Job Title$")
	public void validate_text_on_Job_Title() {
		String JobTitle = driver.findElement(By.xpath("//h1[contains(text(),'Job Titles')]")).getText();
		Assert.assertEquals("Job Titles", JobTitle);
		System.out.println("User is on"+JobTitle+"Menu");
	}

	@Then("^Click on PIM menu$")
	public void click_on_PIM_menu() {
		OrangeOR.ClickOnPIMTab();
		
	}

	@Then("^validate user on PIM Menu$")
	public void validate_user_on_PIM_Menu() {
		String PIM = OrangeOR.getTextOnPIM();
		System.out.println("User is on"+PIM+"Tab");
	}

	@Then("^Click on Time menu$")
	public void click_on_Time_menu() {
		OrangeOR.ClickOnTimeTab();
	}

	@Then("^validate user on Time Menu$")
	public void validate_user_on_Time_Menu() {
		String Time = OrangeOR.getTextOnTime();
		System.out.println("User is on"+Time+"Tab");
	}
	
	@Then("^Close the Browser$")
	public void close_the_Browser() {
		driver.close();
	}
	
}
