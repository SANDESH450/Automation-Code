package Demo.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TS_xpath_Locator_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		// locate user name as tag#id
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		driver.findElement(By.cssSelector("input[name= password]")).sendKeys("secret_sauce");
		
		driver.findElement(By.cssSelector("input.btn_action")).click();
		
		String currentwindowHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("55"));
		
		/*
		 * // // user Name xphath //
		 * driver.findElement(By.tagName("input")).sendKeys("standard_user"); //
		 * driver.findElement(By.name("password")).sendKeys("secret_sauce"); //
		 * driver.findElement(By.xpath("//input[@value = 'LOGIN']")).click(); // //
		 * String currwindowhandle = driver.getWindowHandle(); //
		 * driver.switchTo().window(currwindowhandle); //
		 * driver.findElement(By.partialLinkText("Bolt T-Shirt")).click();
		 */
   }

}
