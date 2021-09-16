package seleniumprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehoover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/sriswedhav/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.browserstack.com/");
	WebElement mouse=driver.findElement(By.id("product-menu-toggle"));
	Actions a = new Actions(driver);
   // a.moveToElement(mouse).perform();
	
   a.moveToElement(mouse).build().perform();
   System.out.println("Tooltip"+ mouse.getText());
   WebElement live = driver.findElement(By.xpath("//a[@aria-label='Live']//div[@class='dropdown-link-heading'][normalize-space()='Live']"));
   live.click();
  //a[@aria-label='Live']//div[@class='dropdown-link-heading'][normalize-space()='Live']

	}

}
