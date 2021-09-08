package seleniumprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class checkselenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver", "/Users/sriswedhav/Downloads/chromedriver");
			WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//button[contains(text(),\"Alle akzeptieren\")]")).click();
		//driver.findElement(By.xpath("//div[contains(text(),\"I agree\")]")).click();
		driver.findElement(By.xpath("//a[@title='English (US)']")).click();	
		Thread.sleep(2000);	
		
		try
		{	
		driver.findElement(By.xpath("//button[@title='Accept All']")).isDisplayed();
		
			driver.findElement(By.xpath("//button[@title='Accept All']")).click();
		}
		catch (Exception e)		
		{
			
	Thread.sleep(2000);
		}
		driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51')]")).click();
	Thread.sleep(2000);
		driver.findElement(By.name("firstname")).click();
		driver.findElement (By.name("firstname")).sendKeys("ser");
		driver.findElement(By.name("lastname")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("dfdf");
		driver.findElement(By.name("reg_email__")).sendKeys("235678993478");
		driver.findElement(By.id("password_step_input")).sendKeys("Smrithi@23434");
		Select month=new Select(driver.findElement(By.xpath("//select[@aria-label='Month']")));
		month.selectByVisibleText("Sep");
	WebElement Day = driver.findElement(By.xpath("//span/select[@aria-label=\"Day\"]"));
    Select select = new Select(Day);

select.selectByIndex(9);
WebElement radio=driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
radio.click();		
/*driver.navigate().back();
driver.navigate().forward();
driver.navigate().to("http://www.amazon.de");*/
Thread.sleep(2000);


	}

}