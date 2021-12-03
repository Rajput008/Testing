package maven1.maven1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitconcept {
public static void main(String args[]) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

		
	    //Fluent wait
    //    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	//    driver.findElement(By.withTimeout(30, TimeUnit.SECONDS))
		
		// visit site
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		//Explicit wait
	//	    WebDriverWait wait = new WebDriverWait(driver, 10);
	//	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("cusid")));

		
		//enter customer id
		driver.findElement(By.name("cusid")).sendKeys("cust1001");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		System.out.println("ID entered");
		
		System.out.println(driver.switchTo().alert().getText());
		//handle alert
		driver.switchTo().alert().dismiss();
		System.out.println("Alert dismissed");
		
		//reset
		driver.findElement(By.name("res")).click();
		System.out.println("reset");
		
		//change customer id
		driver.findElement(By.name("cusid")).sendKeys("cust1007");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		//alert
		driver.switchTo().alert().accept();
		System.out.println("New ID entered and submitted");
		
		// success - click ok
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.close();
		
	}

}
