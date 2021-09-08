package seleniumprac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class itera {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/sriswedhav/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.findElement(By.xpath("//input[@id='name']")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("swer");
	String label=driver.findElement(By.xpath("//label[@for='phone']")).getText();
		
		System.out.print(label);
	
		
		WebElement phoneno=driver.findElement(By.id("phone"));
		phoneno.click();
		phoneno.sendKeys("59769576");
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("red@red.com");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("godisgreat");
		driver.findElement(By.id("address")).sendKeys("address is address");
		
		
		//List<WebElement> radio=driver.findElements(By.xpath("//*[@type='radio']"));
		List<WebElement> radio=driver.findElements(By.xpath("//div[contains(@class,'body-content')]/div[3]//input[@type='radio']"));
		System.out.println("Number of radio buttons   "+radio.size());
		for (int i=0;i<radio.size();i++)
		{
			System.out.println("Step to check radio button selected or not "+radio.get(i).getAttribute("selected"));
			
			
		}
		
		WebElement selection=driver.findElement(By.xpath("//input[@type='radio' and @id='female']"));
		selection.click();
		driver.findElement(By.xpath("//input[@id='monday']")).click();
		driver.findElement(By.id("tuesday")).click();
		// Normal way of selecting text 
		WebElement drop=driver.findElement(By.xpath("//select[@class='custom-select']"));
		Select dropdown=new Select(drop);
		//dropdown.selectByVisibleText("Norway");*/
		
		// when there is multiple options initializing this will work 
	//Select drop=new Select(driver.findElement(By.xpath("//select[@class='custom-select']")));
	//	drop.selectByVisibleText("Norway");
		
		//without using select method
		
		List<WebElement> alloptions=dropdown.getOptions();
		for(WebElement option:alloptions)
		{
			if(option.getText().equals("Italy"))
			{
				option.click();
				break;
			}
		}
WebElement brow=driver.findElement(By.xpath("//input[@id='inputGroupFile02']"));
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView();",brow);

//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", brow);
Thread.sleep(3000);
//brow.click();
//driver.findElement(By.xpath("//input[@id='inputGroupFile02']")).sendKeys("/Users/sriswedhav/Documents//Users/sriswedhav/Documents//Users/sriswedhav/Documents/Tour plan.xlsx");
	brow.sendKeys("/Users/sriswedhav/Documents//Users/sriswedhav/Documents//Users/sriswedhav/Documents/Tour plan.xlsx");
	}
	

	
	
	

	
};
