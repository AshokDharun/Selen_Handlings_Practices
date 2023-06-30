package switchtoMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SwitchToAlart 
{
	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://testproject.io/");
		driver.findElement(By.id("menu-item-1727")).click();
		String mainHandle = driver.getWindowHandle();
		System.out.println("Home Page Window ID: " + mainHandle + "\n");

		Set <String> allHandles = driver.getWindowHandles();
		System.out.println("Windows Open After Clicking The Docs Link via Home Page: " + allHandles.size() + "\n");

		for (String windowHandle : allHandles) {
			if(mainHandle.equals(windowHandle)) {
				System.out.println("\t Window ID 1: \t" + windowHandle +
						"\n \t URL: \t \t" + driver.getCurrentUrl() +            
						"\n \t Title: \t \t" + driver.getTitle());        
			}  
			else  {
				driver.switchTo().window(windowHandle);

				System.out.println("\t Window ID 2: \t" + windowHandle +
						"\n \t URL: \t \t" + driver.getCurrentUrl() +            
						"\n \t Title: \t \t" + driver.getTitle());          
			}
		}
	}
}
