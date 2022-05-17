package SeleniumCodeImpSnippets;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables_Frames_DynamicEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VAISHNA\\OneDrive - Capgemini\\Desktop\\driverchrome1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		List <WebElement> col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println("No of columns: " +col.size()); 
      
        List <WebElement> rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
        System.out.println("No of rows: " + rows.size());
        
        WebElement baseTable = driver.findElement(By.tagName("table"));	
		WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
        String rowtext = tableRow.getText();
		System.out.println("Third row of table : "+rowtext);		    
	
		WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
		String valueIneed = cellIneed.getText();
		System.out.println("Cell value is : " + valueIneed);
		
		//Frames
		driver.navigate().to("https://the-internet.herokuapp.com/frames");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Nested")).click();
	    driver.switchTo().frame("frame-bottom");
	    WebElement m = driver.findElement(By.xpath("//body"));
	    System.out.println("Element identified with xpath: " +m.getText());
        driver.close();
	}

}
