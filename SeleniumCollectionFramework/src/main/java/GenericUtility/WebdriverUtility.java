package GenericUtility;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtility {
	
	public void maximize(WebDriver driver) {
	driver.manage().window().maximize();
	
	}

	public void mouseHover(WebDriver driver,WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public void rightClick(WebDriver driver,WebElement element) {
		Actions act = new Actions(driver);
				act.contextClick(element).perform();
			
	}
	
	public void doubleClick(WebDriver driver,WebElement element){
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();	
	}
	public void selectDropdown(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	public void selectDropdownByText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
		
	}
	public void switchToFrame(WebDriver driver,String nameorId) {
		driver.switchTo().frame(nameorId);

	}
	public void swithToFrame(WebDriver driver,WebElement frameElement) {
		driver.switchTo().frame(frameElement);
		
	}
	public void switchToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
		
	}
	public void switchToAlertAndCancel(WebDriver driver) {
		driver.switchTo().alert().dismiss();	
	}
	
	public void switchToAlert(WebDriver driver) {
		driver.switchTo().alert();
	}
	public void getPhoto(WebDriver driver) throws IOException {
		JavaUtility Jutil  = new JavaUtility();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/"+Jutil.getSystemTime()+".png");
		FileHandler.copy(temp, dest);
		
	}
	
	
	
	
	
	
}
