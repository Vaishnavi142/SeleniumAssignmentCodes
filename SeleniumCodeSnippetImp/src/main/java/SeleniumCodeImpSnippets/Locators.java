package SeleniumCodeImpSnippets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VAISHNA\\OneDrive - Capgemini\\Desktop\\driverchrome1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		if(driver.findElement(By.id("pageFooter")).isDisplayed()) //by id
		    System.out.println("Page footer is visible");
		else
			System.out.println("Page footer is not visible");
		
		if(driver.findElement(By.linkText("Facebook Lite")).isDisplayed())
			System.out.println("The text Facebook Lite is visible"); 	//linktext
		else
			System.out.println("Page footer is not visible");
		
		if(driver.findElement(By.partialLinkText("Up")).isDisplayed())//partial_link_text
			System.out.println("The text with Up is visible"); 	//linktext
		else
			System.out.println("The text with Up is not visible");
		
		if(driver.findElement(By.cssSelector("input[type='password']")).isDisplayed())  //by css selector
			System.out.println("The password tab is visible"); 	//linktext
		else
			System.out.println("The password tab is not visible");
		
		driver.findElement(By.id("email")).sendKeys("123va@gmail.com"); //by classname		
		driver.findElement(By.name("pass")).sendKeys("1234@va"); //by name
		driver.findElement(By.tagName("button")).click();  //by tagname
		driver.findElement(By.xpath("//a[text()='Find your account and log in.']")).click();	//by xpath	
		System.out.println("--Webpage successfully tested--");
		driver.close();
		
		
	}

}
