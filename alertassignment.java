package maven1.maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertassignment {
	public static void main(String args[]) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// visit site
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
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
