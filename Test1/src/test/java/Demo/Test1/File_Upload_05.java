package Demo.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Upload_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/upload-download");
		driver.findElement(By.xpath("//input[@type = 'file']")).sendKeys("X:\\Sandesh Patil\\Work Report\\Big pic5Mb 1.jpg");

	}

}
