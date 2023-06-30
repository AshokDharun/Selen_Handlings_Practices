package handledropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlropDown 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	RemoteWebDriver driver=new ChromeDriver();
	//driver.get("http://sampleapp.tricentis.com/101/app.php");
	/** steps to acces dropdown
	 * 1.import select class
	 * 2.declare dropdown instance in select class
	 * 3.control dropdon usig method,
	 * 
	 */
//	driver.findElement(By.xpath("(//a[@id='nav_automobile'])[1]")).click();
//	Select select=new Select(driver.findElement(By.xpath("//select[@id='make']")));
//	select.selectByValue("Audi");
//	select.selectByIndex(1);
//	select.selectByVisibleText("Audi");
	//deselect
//	select.deselectByIndex(2);
//	select.deselectByValue("Ford");
//	select.selectByVisibleText("Ford");
//	select.deselectAll();
	//multiple section
	driver.get("http://jsbin.com/osebed/2");
	Select fruits = new Select(driver.findElement(By.id("fruits")));
	fruits.selectByVisibleText("Banana");
	fruits.selectByIndex(1);
	
}
}
