package maven1.maven1;

import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandling {
	public static void main(String[] args) {
		// System Property for chrome Driver   
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
	    // Create a new instance of the Chrome driver 
		WebDriver driver = new ChromeDriver(); 
				
		//get URL
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		//Click on blinking text link
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		//Get all windows
		Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]
		
		//Get parent and child window id
		Iterator<String>it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		//switch to child window
		driver.switchTo().window(childId);
		
		//Get Text
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());		
		
		//Swich to parent window
		driver.switchTo().window(parentId);
		
		//Send emailid in username textbox 
		driver.findElement(By.id("username")).sendKeys("shivani@gmail.com");
		
		//driver.close();
	    driver.quit();
	}

}
