package maven1.maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumdropdown {
	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Storing the Application Url in the String variable 
		String url = "https://www.rahulshettyacademy.com/dropdownsPractise/"; 
		
		//Launch the  WebSite 
		driver.get(url); 

		//find dropdown element
		WebElement staticDropDown = driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']"));
		//create object of select class
		Select dropdown = new Select(staticDropDown);  
		
		//As this is static dropdown, order will not change
		//find USD option  using index method
		dropdown.selectByIndex(3);
		
		//Check whether USD is selected or not- Verify
		WebElement selectedElement=dropdown.getFirstSelectedOption();
		
		System.out.println(selectedElement.getText());
		
		//use selectByVisibleText method to select option from dropown
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		//use selectByValue method to select option from dropown
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		driver.close();
		

		
		
		
		
		
		
		
	}
}
