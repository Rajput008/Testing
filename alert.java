package maven1.maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
	public static void main(String[] args) throws InterruptedException {
		
		// System Property for chrome Driver   
	    System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");  
		
	    // Create a new instance of the chrome driver 
		WebDriver driver = new ChromeDriver(); 
		
		String text= "Rajput";
		
		//get URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		
		//Send name
		driver.findElement(By.id("name")).sendKeys(text);
		
		//click on alert button
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		
		//Get text
		System.out.println(driver.switchTo().alert().getText());
		
		//Accept alert by clicking on OK button
		driver.switchTo().alert().accept();
		
		//Click on confirm button
		driver.findElement(By.id("confirmbtn")).click();
		
		//Get text
		System.out.println(driver.switchTo().alert().getText());
		
		//Dismiss alert by clicking on cancel
		driver.switchTo().alert().dismiss();
		
		driver.close();
	}
}

