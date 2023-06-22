package Atesting;



import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AT1 {

	public static void main(String[] args) throws IOException, InterruptedException   {
		// TODO Auto-generated method stub
		
       System.out.println("Hy Starting Automation");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
//		Maximizing window
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
//		Finding UI elements 
//		driver.findElement(By.id("confirm")).click();				//1st method
//		WebElement ele = driver.findElement(By.id("confirm"));     //2nd method
		
//		using css selectors
//		WebElement ele = driver.findElement(By.cssSelector("#confirm"));  
		
//		ele.click();
		
		// We type in search box field
//		driver.findElement(By.name("q")).sendKeys("Avadh Bhalani");	
		
//		we want to clear text
//		WebElement ele = driver.findElement(By.id("textbox1"));
//		Hold the Program execution some time
//		Thread.sleep(3000);
//		ele.clear();
		
		
//		Click on Hyperlink [ After Inspect start tag to End tag copy the text
//		driver.findElement(By.linkText("compendiumdev")).click();
		
		
		
//		How to we get text   [ Get text command we using between the tag ] 
//		String text = driver.findElement(By.id("pah")).getText();
//		System.out.println(text);
		
//		How we get title
//		String Title = driver.getTitle();
//		System.out.println("Title of the page" + Title);
		
//		 How we getting Current url
//		 driver.findElement(By.linkText("compendiumdev")).click();
//		 String url = driver.getCurrentUrl();
//		 System.out.println(url);	

//		 open pop-up window
//		 driver.findElement(By.linkText("Open a popup window")).click();
		
//		How we get text in write any box we using attribute [ Get Attribute using when we get the attribute value ]
//		String AttributeText = driver.findElement(By.id("textbox1")).getAttribute("value");
//		System.out.println(AttributeText);
		
		
//		Button is display or not
//		boolean display1 = driver.findElement(By.id("but2")).isDisplayed();
//		System.out.println(display1);
//		boolean Enabled = driver.findElement(By.id("but1")).isEnabled();
//		System.out.println(Enabled );
		
		
//		How we check this check box is selected or not
//		boolean select = driver.findElement(By.id("checkbox2")).isSelected();
//		System.out.println(select);
		
//		how to navigated and again back
//		driver.navigate().to("https://stridefuture.com/");
//		 Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		
		
//		How we getting page source code
//		String sourcecode = driver.getPageSource();
//		System.out.println(sourcecode);
//		
		
//		Css selector
//		 String value = driver.findElement(By.id("home")).getCssValue("text-align");
//	     System.out.println(value);	
		
//	     how to we find the dimension
//	    org.openqa.selenium.Dimension d = driver.findElement(By.id("but2")).getSize();
//	     System.out.println(d.height);
//	     System.out.println(d.width);
//	     
	     
//	     location use 
//	     Point p = (Point) driver.findElement(By.id("but2")).getLocation();
//	     System.out.println("X coordinate point" + p.x);
    
//	    full screen
	  // driver.manage().window().fullscreen();
	    
////		More than one web elements
//		List<WebElement> element = driver.findElements(By.tagName("a"));
//		
//		for(int i=0; i<element.size(); i++) {
//			
////			System.out.println(element.get(i));
//			System.out.println(element.get(i).getText().length()>0);{
//				
//				System.out.println(element.get(i).getText());
//				
//			}
//			
//		}
		
		// pop-up window how we getting text.
//		 driver.findElement(By.linkText("Open a popup window")).click();
//		 String firstline = driver.findElement(By.id("para1")).getText();
//		 System.out.println(firstline);
		
		
		// ScreenShots How we taken
//		File sc1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(sc1, new File("Screenshots\\Screenshots1.png"));
//		 System.out.println("========");
//		 //Again another sc i would to take here
//		 driver.findElement(By.linkText("onlytestingblog")).click();
//		 File sc2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
//		 FileUtils.copyFile(sc2, new File("Screenshots\\Screenshots2.png"));
		 
		 
//		Table Part
//		List<WebElement> heading = driver.findElements(By.xpath("//table[@id='table1']//th"));   //Table heading
//		List<WebElement> data = driver.findElements(By.xpath("//table[@id='table1']//td"));   //Table data
//		List<WebElement> data1 = driver.findElements(By.xpath("//table[@id='table1']//tr[1]/td"));   //Table row data
		List<WebElement> data2 = driver.findElements(By.xpath("//table[@id='table1']//tr[3]/td[2]"));
		
		
		
		for(int i= 0; i < data2.size(); i++) {
		
			System.out.println(data2.get(i).getText());                                          
			
		}
		
		
		
		
		
		
		
		
		
		 
		 
		 
		 
		 System.out.println("*/*/*/*/*/*/*/*/");
		Thread.sleep(2500); 
//		 driver.close();  //only current window is close
		 driver.quit();    // all open window are close
		 
	}

}
