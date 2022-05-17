package SeleniumCodeImpSnippets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VAISHNA\\OneDrive - Capgemini\\Desktop\\driverchrome1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		try
		{
		driver.findElement(By.xpath("//div[@aria-label='Close ad']")).click();
		System.out.println("Ad closed");
		}
		catch(Exception e)
		{
			System.out.println("No ad found");	
		}
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();
		System.out.println("Clicked Selenium");
		driver.findElement(By.xpath("//a[text()='Selenium Auto IT']")).click();
		System.out.println("Selected Selenium Auto IT");
		Thread.sleep(1000);
		try
		{
		driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
		System.out.println("Ad closed");
		}
		catch(Exception e)
		{
			System.out.println("No ad found");	
		}
		driver.findElement(By.xpath("//span[text()='Testing")).click();
		System.out.println("Selected Testing");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[@aria-label='Expand child menu'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='SAP Testing'])[1]")).click();
		System.out.println("Selected SAP Testing");
		Thread.sleep(1000);
		driver.close();
		
	}

}
