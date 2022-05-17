package SeleniumCodeImpSnippets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Explicit_Implicit_Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty ("webdriver.chrome.driver","C:\\Users\\VAISHNA\\OneDrive - Capgemini\\Desktop\\driverchrome1\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		
		driver.get("http://demo.guru99.com/test/guru99home/" );
		System.out.println( "Entered into website");
		driver.manage().window().maximize() ;
		String eTitle = "Demo Guru99 Page";
		String aTitle = "" ;
		aTitle = driver.getTitle();
		if (aTitle.equals(eTitle))
		{
		System.out.println( "Expected title is same as Actual Title");
		}
		else 
		{
		System.out.println( "Expected title is different from Actual Title" );
		}
		
		driver.close();
	}

}
