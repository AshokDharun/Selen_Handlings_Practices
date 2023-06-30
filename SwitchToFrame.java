package switchtoMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchToFrame 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	RemoteWebDriver driver=new ChromeDriver();
	driver.get("https://testproject.io/");
	//scroll down using javascript executer(JavascriptExecutor)
	JavascriptExecutor js=driver;
	js.executeScript("window.scrollBy(0,2000)");
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@allow='join-ad-interest-group']")));
	driver.switchTo().frame(1);
	//error can't find the frame
	driver.findElement(By.xpath("//*[@allow='join-ad-interest-group']")).click();
}
}
