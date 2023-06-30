package handleRadio_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HAmdleRadioButton
{
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	RemoteWebDriver driver=new ChromeDriver();
	driver.get("http://sampleapp.tricentis.com/101/app.php");
	driver.findElement(By.xpath("(//a[@id='nav_automobile'])[1]")).click();
	driver.findElement(By.id("enterinsurantdata")).click();
	//Select radio button  using wait 
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[text()='Male']"))));
WebElement ele=driver.findElement(By.xpath("//*[text()='Male']"));	//driver.findElement(By.xpath("//*[text()='Male']")).click();
if(ele.isSelected())
{
	System.out.println("radio button already select");

}else
{
	System.out.println("radio button not select");
	ele.click();
}
	
}
}
