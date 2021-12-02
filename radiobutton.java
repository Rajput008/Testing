package maven1.maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class radiobutton {
	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/radio.html"); 
		Thread.sleep(3000);
		
		//check that option1 button is not selected
	//	driver.findElement(By.id("vfb-7-1")).isSelected();	
		Assert.assertFalse(driver.findElement(By.id("vfb-7-1")).isSelected());
		
		//click button
		driver.findElement(By.id("vfb-7-1")).click();

		//isSelected will return true or false value
		System.out.println(driver.findElement(By.id("vfb-7-1")).isSelected());
		
		
		//Check if the option1 is selected
		//driver.findElement(By.id("vfb-7-1")).isSelected();
		Assert.assertTrue(driver.findElement(By.id("vfb-7-1")).isSelected());

		driver.close();
				
	}
}
