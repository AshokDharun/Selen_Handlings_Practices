package handleRadio_Checkbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandleCheckBox 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	RemoteWebDriver driver=new ChromeDriver();
	driver.get("http://sampleapp.tricentis.com/101/app.php");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//a[@id='nav_automobile'])[1]")).click();
	driver.findElement(By.id("enterinsurantdata")).click();
	JavascriptExecutor js=driver;
	js.executeScript("window.scrollBy(0,700)");
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[text()=' Speeding']")).click();
	//multiple chk box
	driver.findElement(By.xpath("//*[text()=' Bungee Jumping']")).click();
}
}
