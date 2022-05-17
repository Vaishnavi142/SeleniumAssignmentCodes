package SeleniumCodeImpSnippets;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro 
{
	public static void main(String[] args) throws InterruptedException 
	{		// TODO Auto-generated method stub
		
		String url = "http://www.facebook.in/";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VAISHNA\\OneDrive - Capgemini\\Desktop\\driverchrome1\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get(url);
		Thread.sleep(3000);
	}

}

//driver.navigate().back();
//driver.navigate().forward();
//driver.navigate().refresh();
//driver.switchTo().newWindow(WindowType.WINDOW); opens new window
//driver.switchTo().newWindow(WindowType.TAB); opens new tab
//driver.switchTo().window(ChildWindow)
//driver.switchTo().alert().dismiss();
//driver.switchTo().alert().accept();
//driver.switchTo().alert().getText();
//driver.switchTo().alert().sendKeys("Text");