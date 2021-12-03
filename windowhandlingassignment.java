package maven1.maven1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandlingassignment {
	public static void main(String args[]) {
			// System Property for chrome Driver   
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			
		    // Create a new instance of the chrome driver 
			WebDriver driver = new ChromeDriver(); 
					
			//get URL
			driver.get("http://demo.guru99.com/popup.php\r\n");
			
			//click on link
			driver.findElement(By.linkText("Click Here")).click();
			
			//Get all windows
			Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]
			
			//Get parent and child window id
			Iterator<String>it = windows.iterator();
			String parentId = it.next();
			String childId = it.next();
		
			//switch to child window
			driver.switchTo().window(childId);
			
			//enter the details and submit
			driver.findElement(By.name("emailid")).sendKeys("ajay@gmail.com");
			driver.findElement(By.name("btnLogin")).click();
		
			//close the child window
			driver.close();
			
			//switch to parent id
			driver.switchTo().window(parentId);
		
		
	}
}
