package SeleniumCodeImpSnippets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommandsInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VAISHNA\\OneDrive - Capgemini\\Desktop\\driverchrome1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		//String e=driver.getTitle();
		//System.out.println("Page Title: "+e);
		driver.findElement(By.name("q")).sendKeys("Automation"+Keys.ENTER);
		System.out.println("Successfully navigated");
		//String PageSource = driver.getPageSource();
		//System.out.println("Page Source: "+PageSource);
		/*boolean result = driver.getPageSource().contains("Google");
		System.out.println("Webpage contains : "+result);
		driver.navigate().to("https://capgemini.com");
		System.out.println("Navigated to given website");
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("Navigated back from Capgemini.com");
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println("Navigated forward to Capgemini.com");
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println("Website refresed");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/login/");
		System.out.println("Navigated forward to Facebook.com");
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("123@gmail.com");
		System.out.println("Entered username");
		Thread.sleep(2000);
		element.clear();
		System.out.println("Element cleared");
		WebElement check=driver.findElement(By.xpath("//div[@class='_9axz']"));
		check.isDisplayed();
		System.out.println(check);*/
		driver.close();
	}

}
