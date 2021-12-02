package maven1.maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumbasicscript {
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
			
		
		//sign in
	    driver.findElement(By.id("inputUsername")).sendKeys("Pooja");
	    driver.findElement(By.name("inputPassword")).sendKeys("Pooja123");
	    driver.findElement(By.xpath("//*[@id='chkboxOne'][@name='chkboxOne']")).click();
	    driver.findElement(By.xpath("//*[@id='chkboxTwo'][@name='chkboxTwo']")).click();
	    driver.findElement(By.xpath("//*[@type='submit']")).click();
	    System.out.println("Incorrect username or password");

	    
	    //forget password
	    driver.findElement(By.linkText("Forgot your password?")).click(); 
	    
	    
	    driver.findElement(By.xpath("//*[@id='container']/div[1]/form/input[1]")).sendKeys("pooja");
	    driver.findElement(By.xpath("//*[@id='container']/div[1]/form/input[2]")).sendKeys("pooja@gmail.com");
	    driver.findElement(By.xpath("//*[@id='container']/div[1]/form/input[3]")).sendKeys("8553464226");
	    Thread.sleep(1000);
	   
	    //reset login
	    driver.findElement(By.xpath("//*[@id='container']/div[1]/form/div/button[2]")).click();
	    System.out.println("resetting password");

	   // driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
			
		//go back to login page
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
	    System.out.println("trying to login ");

	
		//login
	    driver.findElement(By.id("inputUsername")).sendKeys("Pooja");
	    driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@type='submit']")).click();
	    System.out.println("Logged in sucessfully");
	    driver.close();
	   
	
	}
}
