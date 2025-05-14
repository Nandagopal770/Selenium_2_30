package GenericUtility;

import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	public WebdriverUtility wUtil = new WebdriverUtility();
	public FileUtility fUtil = new FileUtility();
	
public static WebDriver driver;
	@BeforeClass
	public void openBrowser() throws IOException {
		driver = new ChromeDriver();
	wUtil.maximize(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get(fUtil.getDataFromProperty("url"));
	
	}	
@AfterClass
public void closeBrowser() {
	driver.quit();
}
}
