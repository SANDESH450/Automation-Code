package Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Alert_Popup_010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
//		driver.findElement(By.xpath("//button[@onclick = 'jsAlert()']")).click();
//		
//		driver.switchTo().alert().accept();
		
        driver.findElement(By.xpath("//button[@onclick = 'jsPrompt()']")).click();
		
		driver.switchTo().alert().sendKeys("Sandesh");
		driver.switchTo().alert().accept();

	}

}
