package Demo.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio_Button_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://practice.expandtesting.com/radio-buttons");
		
		List <WebElement> radioButtonList = driver.findElements(By.xpath("//input[@type = 'radio']"));
		
		System.out.println("Radio button list " + radioButtonList.size());
		
		driver.close();
		
	}

}
