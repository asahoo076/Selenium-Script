package US.Coke.SignUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class basicSignup {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser has been opened");
		String URL = "https://anonprod:TcCcAnon&1@preview.us.coca-cola.com";
		driver.get(URL);
		System.out.println("Coke site has been opened");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Actions action = new Actions(driver);
	
		WebElement reg = driver.findElement(By.id("icon_login"));
		action.moveToElement(reg).build().perform();
		Thread.sleep(1000);
		WebElement signup=driver.findElement(By.xpath("//*[@data-object-id='signup-click']"));
		action.moveToElement(signup).click().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@name='traditionalRegistration_firstName']")).sendKeys("Ajit");
		driver.findElement(By.xpath("//*[@name='traditionalRegistration_lastName']")).sendKeys("Sahoo");
		driver.findElement(By.xpath("//*[@name='traditionalRegistration_emailAddress']")).sendKeys("abc12@mcr.com");
		driver.findElement(By.xpath("//*[@name='traditionalRegistration_emailConfirm']")).sendKeys("abc12@mcr.com");
		driver.findElement(By.xpath("//*[@name='traditionalRegistration_password']")).sendKeys("Coke@123");
		driver.findElement(By.xpath("//*[@name='address_zip']")).sendKeys("10025");
		
		// Entering birthday month
		WebElement month = driver.findElement(By.xpath("//*[@name='birthdate[dateselect_month]']"));
		action.moveToElement(month).click().perform();
		Select monthDrp = new Select(month);
		monthDrp.selectByVisibleText("April");
		Thread.sleep(1000);
		
		//Entering  birthday day
		WebElement day = driver.findElement(By.xpath("//*[@name='birthdate[dateselect_day]']"));
		action.moveToElement(day).click().perform();
		Select dayDrp = new Select(day);
		dayDrp.selectByValue("12");
		Thread.sleep(1000);
		
		//Entering birthday Year
		WebElement year = driver.findElement(By.xpath("//*[@name='birthdate[dateselect_year]']"));
		action.moveToElement(year).click().perform();
		Select yearDrp = new Select(year);
		yearDrp.selectByValue("1997");
		Thread.sleep(1000);

		driver.close();
	}
	

}
