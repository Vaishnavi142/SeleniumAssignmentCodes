package SeleniumCodeImpSnippets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InvokeDifBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VAISHNA\\OneDrive - Capgemini\\Desktop\\driverchrome1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("Chrome browser successfully invoked");
		driver.close();
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\VAISHNA\\OneDrive - Capgemini\\Desktop\\edgedriver\\msedgedriver.exe");
		WebDriver driver1 = new EdgeDriver();
		driver1.get("https://www.facebook.com/login/");
		driver1.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("MS Edge browser successfully invoked");
		driver1.quit();
	}

}
