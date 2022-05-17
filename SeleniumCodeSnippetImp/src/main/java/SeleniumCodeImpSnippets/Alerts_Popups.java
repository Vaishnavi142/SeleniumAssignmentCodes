package SeleniumCodeImpSnippets;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VAISHNA\\OneDrive - Capgemini\\Desktop\\driverchrome1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        driver.findElement(By.name("cusid")).sendKeys("53920");	
        System.out.println("Entered Customer ID");
        driver.findElement(By.name("submit")).submit();   
        System.out.println("Pressed Submit button");
        Alert alert = driver.switchTo().alert();  
       
        String alertMessage= driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        alert.accept();
        System.out.println("Alert message accepted");
        driver.close();
        
        System.setProperty("webdriver.chrome.driver","C:\\Users\\VAISHNA\\OneDrive - Capgemini\\Desktop\\driverchrome1\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
        driver1.get("http://demo.guru99.com/popup.php");
        System.out.println("Popup window opened");
        driver1.manage().window().maximize();		
                		
        driver1.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
        System.out.println("Popup clicked");
        String MainWindow=driver1.getWindowHandle();			
        Set<String> s1=driver1.getWindowHandles();		
        Iterator<String> i1=s1.iterator();		
        System.out.println("Entering child window");	
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();	            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            { 
                    driver1.switchTo().window(ChildWindow);	                                                                                                           
                    driver1.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");                   
                    driver1.findElement(By.name("btnLogin")).click();
                    driver1.close();		
            }		
        }
            driver1.switchTo().window(MainWindow);
            System.out.println("Switched to main window");
            Thread.sleep(2000);
            driver1.quit();
	}

}
