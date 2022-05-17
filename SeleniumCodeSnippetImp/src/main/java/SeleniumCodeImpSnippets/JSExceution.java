package SeleniumCodeImpSnippets;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExceution {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VAISHNA\\OneDrive - Capgemini\\Desktop\\driverchrome1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println("Navigated to website");
        driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("alert('Welcome to Selenium')");
		Thread.sleep(3000);
		System.out.println("alert box created");
		driver.switchTo().alert().accept();
		System.out.println("JS Executor executed successfully");
		
		driver.navigate().to("https://login.yahoo.com/");
        System.out.println("Navigated to website");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("vish@gmail.com");
        //driver.findElement(By.xpath("//*[contains(text(),'Stay signed')]")).click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("document.getElementById('persistent').click()");
        Thread.sleep(2000);
        System.out.println("unchecked the stay signed box");
        driver.close();
        }

}
