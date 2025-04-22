package Demo.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Count_hyperlink_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	

		driver.get("https://www.calculator.net/fitness-and-health-calculator.html");
		
		driver.manage().window().maximize();

		List <WebElement> linkElment = driver.findElements(By.tagName("a"));
		
		System.out.println("Total link of webpags:" + linkElment.size());
		
		for(WebElement el:linkElment)
		{
			System.out.println(el.getText());
		}
		
		driver.close();
	}

}
