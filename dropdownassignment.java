package maven1.maven1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownassignment {
	public static void main(String args[]) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		//Launch the  WebSite 
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/"); 
	
		//find the dynamic drop down
		driver.findElement(By.xpath("//*[@placeholder='Type to Select']")).click();
		
		//type Ind 
		driver.findElement(By.xpath("//*[@placeholder='Type to Select']")).sendKeys("Ind");
		Thread.sleep(1000);
			
		//select India using locator
	//	driver.findElement(By.xpath("//*[@id='ui-id-4']")).click();
		
		//Select India using loop
	
		List<WebElement> options =driver.findElements(By.cssSelector("a[class='ui-corner-all']"));
			
		for(WebElement option :options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
					option.click();
					break;
			}
		}
			
		System.out.println("Selected India");
		driver.close();
		
	}
}

