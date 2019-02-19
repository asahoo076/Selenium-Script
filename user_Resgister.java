package Mercury.Tour.Validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class user_Resgister {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asahoo3\\Documents\\Applications\\chromedriver.exe");
		driver = new ChromeDriver();
		String url = "http://newtours.demoaut.com/";
		driver.get(url);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//Click on the register hyperlink
		driver.findElement(By.xpath("//*[@width='77'] ")).click();
		Thread.sleep(1000);
		
		//Entering data in the textboxes
		driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("Ajit");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("Sahoo");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("123456789");
		Thread.sleep(1000);
		driver.findElement(By.id("userName")).sendKeys("ajitsahoo96@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("Bhubaneswar");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='address2']")).sendKeys("Odisha");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='city']")).sendKeys("BBSR");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='state']")).sendKeys("Odisha");
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		WebElement country = driver.findElement(By.xpath("//*[@name='country']"));
		action.moveToElement(country).click().perform();
		Select countryDrp = new Select(country);
		countryDrp.selectByVisibleText("India");

		
		driver.close();

	}

}
