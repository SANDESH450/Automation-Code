package Demo.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_down_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
        WebDriver  driver = new ChromeDriver();   
        
        driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement element  = driver.findElement(By.className("input-country"));
		
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText("Albania");
		
		
		

	}

}
