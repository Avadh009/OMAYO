package Atesting;
import java.util.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.util.SystemOutLogger;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AT2 {

	public static void main(String[] args) throws InterruptedException {


		System.out.println("Hy Starting Automation");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.makemytrip.com/"); //Use this Auto-suggetion
//		Maximizing window
//		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
//		driver.findElement(By.id("fromCity")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys("Del");
//		
//		Thread.sleep(1000);
//		int i = 0;
//		while(i<4) {
//			driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys(Keys.DOWN);
//			i++;
//		}
		
		
		
//		driver.get("https://demo.guru99.com/test/");  //Date selecting use this site
//		driver.manage().window().maximize();
//		WebElement datebox = driver.findElement(By.xpath("//input[@name = 'bdaytime']"));
////		File date as [mmddyy]
//		datebox.sendKeys("01162000");
//		datebox.sendKeys(Keys.TAB);
//		datebox.sendKeys("0800AM");
		
		
		driver.get("https://trains.abhibus.com/?channel=abhibus-web");
		driver.manage().window().maximize();
		WebElement date = driver.findElement(By.className("doj"));
		date.click();
		System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]")).getText());
		//Select Month
		while(!driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]")).getText().contains("September")) {
			
			//Next button like >>
			driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/button[2]/span[1]/*[1]")).click();
			
		}
		 java.util.List<WebElement> days = driver.findElements(By.className("MuiTouchRipple-root']"));
		 
		for(int i=0; i< days.size();i++) {
			
			if(days.get(i).getText().equalsIgnoreCase("20")) {		
				
				days.get(i).click();
				break;	
			}
		}
		
		

	}

}
