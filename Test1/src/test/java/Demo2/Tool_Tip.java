package Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tool_Tip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();

	  driver.get("https://demoqa.com/tool-tips");
	  
	
		 String acturetooltip =  driver.findElement(By.xpath("//div[@class='tooltip-inner' and text()='You hovered over the text field']")).getText(); 
	 
	 String Expectedtooltip = "You hovered over the text field";
	 
	 if(acturetooltip.equals(Expectedtooltip))
	 {
		 System.out.println("Text Passed");
		
	 }
	 else
	 {
		 System.out.println("Text failed");
	 }
	 
	//  ToolTip = driver.findElement(By.xpath("//textarea[@class ='gLFyf']")).getAttribute("")
	  
	}

}