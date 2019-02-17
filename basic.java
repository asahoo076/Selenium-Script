import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basic {
	 WebDriver driver;
	 
	 @Before
	 
	 public void openBrowser()
	 {
		 driver = new ChromeDriver();
		 System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		 String url = " https://anonprod:TcCcAnon&1@preview.us.coca-cola.com";
		 driver.get(url);
		
	 }
	 
	 @Test
	 public void action() throws Exception
	 {
		// WebDriverWait wait = new WebDriverWait(driver,20);
		 boolean logo =  driver.findElement(By.xpath("//*[@data-object-id=\"nav-header-logo\"]")).isDisplayed();
		 System.out.println(logo);
		 String expectedTitle = "Coca-Cola";
		 String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle))
		 {
			 System.out.println("Title Matched");
		 }else
			 System.out.println("Title Not Matched"+"\n"+driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 Actions action = new Actions(driver);
			WebElement reg = driver.findElement(By.xpath("//*[@data-object-id=\"signin-signup-dropdown\"]"));
			action.moveToElement(reg).perform();
		 WebElement brand = driver.findElement(By.xpath("//*[@data-object-id=\"nav-header-our-brands\"]"));
		 action.moveToElement(brand).build().perform();
		 Thread.sleep(2000);
		 WebElement shop = driver.findElement(By.xpath("//*[@aria-label=\"Shop Coca-Cola\"]"));
		 action.moveToElement(shop).build().perform();
		 Thread.sleep(2000);
		 
		//	WebElement reg = driver.findElement(By.xpath("//*[@data-object-id=\"signin-signup-dropdown\"]"));
			//action.moveToElement(reg).perform();
		 
		 //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-object-id=\\\"nav-header-give\\\"]")));
		
		 


	 }
	 
	 @After
	 
	 public void close() throws InterruptedException
	 {
		 Thread.sleep(5000);
		 driver.close();
		 
	 }
	 
	 

}
