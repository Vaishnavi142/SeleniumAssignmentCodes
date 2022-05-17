package SeleniumCodeImpSnippets;

import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Controls 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VAISHNA\\OneDrive - Capgemini\\Desktop\\driverchrome1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		//Radio button
		WebElement radio=driver.findElement(By.xpath("//p[text()='Student ']"));
		radio.click();
		System.out.println("Radio button: Selected Student Fairs");
		
		//prompt
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		try
		{
		WebElement clickable=driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']"));
		if(clickable.isDisplayed())
		{
			clickable.click();
			System.out.println("Prompt: Closed the prompt");
		}
		else
		{
			System.out.println("Prompt: Cannot close the prompt");
		}
		}
		catch(Exception e)
		{
			System.out.println("Prompt: Prompt not found");
		}
		
		//check box
		driver.findElement(By.xpath("//span[text()='Refundable Fares']")).click();
		System.out.println("Check box: Selected Refundable fares");
		Thread.sleep(3000);
		
		//slider
		WebElement From=driver.findElement(By.xpath("//div[@class='rangeslider__handle']"));
		//WebElement To = driver.findElement(By.xpath("//div[@class='rangeslider__fill']"));
		Actions act = new Actions(driver);
		//act.dragAndDrop(From, To).build().perform();		
		act.dragAndDropBy(From, 30,10).build().perform();
		System.out.println("Slider: Changed the price filter");
		
		//drop down
		driver.findElement(By.xpath("//div[@class='selectDropdown make_relative']")).click();		
		driver.findElement(By.xpath("//li[text()='Round Trip']")).click();
		System.out.println("Drop down: Selected way of trip");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter City']")).sendKeys("Chennai");
		driver.findElement(By.xpath("(//span[@class='sr_city '])[1]")).click();
		System.out.println("Drop down: Selected 'from' place");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter City']")).sendKeys("Bengaluru");
		driver.findElement(By.xpath("(//span[@class='sr_city '])[1]")).click();
		System.out.println("Drop down: Selected 'to' place");
		
		driver.findElement(By.xpath("(//div[@class='DayPicker-Day'])[10]")).click();
		driver.findElement(By.xpath("//input[@id='return']")).click();
		driver.findElement(By.xpath("(//div[@class='DayPicker-Day'])[20]")).click();
		System.out.println("Drop down: Selected 'from' and 'to' date"); 
		driver.findElement(By.xpath("//button[@id='search-button']")).click();
		System.out.println("Flights listed for the requested category");
		driver.close();
	}

}


