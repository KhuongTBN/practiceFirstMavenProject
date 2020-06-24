package practiceFirstMavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	public static WebDriver driver;
	
	@BeforeSuite
	public void initializeWebDriver() {
		System.setProperty("webdriver.chrome.driver", "\\src\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		// To maximize browser
		driver.manage().window().maximize();
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		
		//To open Gmail site
		driver.get("https://www.gmail.com");
	}
	
	@AfterSuite
	public void quitDriver(){
		driver.quit();
	}
}
