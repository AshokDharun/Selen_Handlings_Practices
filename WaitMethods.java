package waitMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethods
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	RemoteWebDriver driver=new ChromeDriver();
	driver.get("http://52.66.129.203:4200/#/auth/login");

	driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);System.out.println("pageload timeout");
	driver.findElement(By.id("mat-input-0")).sendKeys("8680097929");
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	System.out.println("implicity waits");
	
	//explicit wait
	
	driver.findElement(By.id("mat-input-1")).sendKeys("Ashok@123");
	WebDriverWait wait=new WebDriverWait(driver, 3);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mat-input-1")));
	driver.findElement(By.id("kt_login_signin_submit")).click();
	
}
}
