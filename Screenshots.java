package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Screenshots 
{
public static void main(String[] args) throws IOException
{
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	RemoteWebDriver driver=new ChromeDriver();
	driver.get("http://sampleapp.tricentis.com/101/app.php");
	driver.manage().window().maximize();
	/**
	 * tak screenshot driver webpage
	 */
	File scr=driver.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshots/img.png");
	org.openqa.selenium.io.FileHandler.copy(scr, dest);
	
	/**
	 * tak screnshot web element
	 */
	WebElement ele=driver.findElement(By.xpath("//select[@id='make']"));
	File elsrc=ele.getScreenshotAs(OutputType.FILE);
	File eldes=new File("./screenshots/img2.png");
	FileHandler.copy(elsrc, eldes);
	
}


}
