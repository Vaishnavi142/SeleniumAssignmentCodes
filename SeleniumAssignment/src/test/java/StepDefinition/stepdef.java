package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdef {
	
		// TODO Auto-generated method stub
		WebDriver driver;
		@Given("User clicks the website")
		public void user_clicks_the_website() {
		    // Write code here that turns the phrase above into concrete actions
			 try
			   {
				   System.setProperty("webdriver.chrome.driver","C:\\Users\\VAISHNA\\OneDrive - Capgemini\\Desktop\\driverchrome1\\chromedriver.exe");
					driver=new ChromeDriver();
					driver.get("http://automationpractice.com/index.php");
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
					System.out.println("PASSED: User entered into the website!!!");
			   }
			   catch(Exception e)
			   {
				   System.out.println("EXCEPTION FOUND: Cannot open the browser!!!");
				   Assert.fail();
			   }
		    
		}
		@When("User clicks signin button")
		public void user_clicks_signin_button() {
		    // Write code here that turns the phrase above into concrete actions
			try
			   {
				   driver.findElement(By.xpath("//a[@class='login']")).click();
					System.out.println("PASSED: User clicked the signin button!!!");
			   }
			   catch(Exception e)
			   {
				   System.out.println("EXCEPTION FOUND: Cannot click the signin button!!!");
				   Assert.fail();
			   }
		}
		@When("User enters email and password under Already Registered.")
		public void user_enters_and_under_already_registered() {
		    // Write code here that turns the phrase above into concrete actions
			try
			   {
				   driver.findElement(By.id("email")).sendKeys("vish123@gmail.com");
				   Thread.sleep(1000);
				   driver.findElement(By.id("passwd")).sendKeys("vishu1420");
					System.out.println("PASSED: User entered Username and Password!!!");
			   }
			   catch(Exception e)
			   {
				   System.out.println("EXCEPTION FOUND: Cannot enter Username and Password!!!");
				   Assert.fail();
			   }
		}
		@Then("User clicks the signin button")
		public void user_clicks_the_signin_button() {
		    // Write code here that turns the phrase above into concrete actions
			try
			   {
				   driver.findElement(By.id("SubmitLogin")).click();
				   Thread.sleep(1000);				   
				   System.out.println("PASSED: User clicks the signin button!!!");
			   }
			   catch(Exception e)
			   {
				   System.out.println("EXCEPTION FOUND: Cannot find signin button!!!");
				   Assert.fail();
			   }
		}
		@Given("User enters their account")
		public void user_enters_their_account() {
		    // Write code here that turns the phrase above into concrete actions
			try
			   {
					String expectedtitle="My account - My Store";
					String actualtitle=driver.getTitle();
					Assert.assertEquals(expectedtitle,actualtitle);
					System.out.println("PASSED:User navigated to the intended page!!!");
			   }
			   catch(Exception e)
			   {
				   System.out.println("EXCEPTION FOUND: Cannot navigate to the intended page!!!");
				   Assert.fail();
			   }
		}
		@When("User moves cursor over Women's link")
		public void user_moves_cursor_over_women_s_link() {
		    // Write code here that turns the phrase above into concrete actions
			try
			   {
					WebElement ele = driver.findElement(By.xpath("//a[@title='Women']"));
					Actions action = new Actions(driver);
					action.moveToElement(ele).perform();
					System.out.println("PASSED:Cursor moved over Women's link!!!");
			   }
			   catch(Exception e)
			   {
				   System.out.println("EXCEPTION FOUND: Cannot move cursor over Women's link!!!");
				   Assert.fail();
			   }
		}
		@When("User clicks on T-shirts")
		public void user_clicks_on_t_shirts() {
		    // Write code here that turns the phrase above into concrete actions
			try
			   {
					driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]")).click();
					Thread.sleep(3000);
					System.out.println("PASSED:User clicked the T-shirt option from Women's link!!!");
			   }
			   catch(Exception e)
			   {
				   System.out.println("EXCEPTION FOUND: Cannot click the T-shirt option!!!");
				   Assert.fail();
			   }
		}
		@When("User hovers mouse on second product")
		public void user_hovers_mouse_on_second_product() {
		    // Write code here that turns the phrase above into concrete actions
			try
			   {
					WebElement ele = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
					Actions action = new Actions(driver);
					action.moveToElement(ele).perform();
					System.out.println("PASSED:User hovers on the second product!!!");
			   }
			   catch(Exception e)
			   {
				   System.out.println("EXCEPTION FOUND: Cannot hover on the second product!!!");
				   Assert.fail();
			   }
		}
		@When("User clicks on More button")
		public void user_clicks_on_more_button() {
		    // Write code here that turns the phrase above into concrete actions
			try
			   {
					driver.findElement(By.xpath("//span[text()='More']")).click();
					Thread.sleep(2000);
					System.out.println("PASSED:User clicked the more button!!!");
			   }
			   catch(Exception e)
			   {
				   System.out.println("EXCEPTION FOUND: Cannot click the 'more' button!!!");
				   Assert.fail();
			   }
		}
		@When("User clicks the Increase quantity button to {int}")
		public void user_clicks_the_increase_quantity_button_to(Integer int1) {
		    // Write code here that turns the phrase above into concrete actions
			try
			   {
					driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
					Thread.sleep(2000);
					System.out.println("PASSED:User increased the quantity to 2!!!");
			   }
			   catch(Exception e)
			   {
				   System.out.println("EXCEPTION FOUND: Cannot click the increase quantity button!!!");
				   Assert.fail();
			   }
		}
		@When("User Selects size as L")
		public void user_selects_size_as_l() {
		    // Write code here that turns the phrase above into concrete actions
			try
			   {
					driver.findElement(By.id("group_1")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//option[@title='L']")).click();
					System.out.println("PASSED:User selected the size as 'L'!!!");
			   }
			   catch(Exception e)
			   {
				   System.out.println("EXCEPTION FOUND: Cannot click the size button!!!");
				   Assert.fail();
			   }
		}
		@When("User selects the color")
		public void user_selects_the_color() {
		    // Write code here that turns the phrase above into concrete actions
			try
			   {
					driver.findElement(By.xpath("//a[@name='Blue']")).click();
					Thread.sleep(2000);
					System.out.println("PASSED:User selected the color!!!");
			   }
			   catch(Exception e)
			   {
				   System.out.println("EXCEPTION FOUND: Cannot click the choose color button!!!");
				   Assert.fail();
			   }
		}
		@When("User clicks the Add to cart button")
		public void user_clicks_the_add_to_cart_button() {
		    // Write code here that turns the phrase above into concrete actions
			try
			   {
					driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
					Thread.sleep(3000);
					System.out.println("PASSED:User clicked the 'Add to cart' button'!!!");
			   }
			   catch(Exception e)
			   {
				   System.out.println("EXCEPTION FOUND: Cannot click the 'Add to cart' button'!!!");
				   Assert.fail();
			   }
		}
		@Then("User clicks the proceed to checkout button")
		public void user_clicks_the_proceed_to_checkout_button() {
		    // Write code here that turns the phrase above into concrete actions
			try
			   {
					driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
					Thread.sleep(2000);
					System.out.println("PASSED:User clicked the 'Proceed to checkout' button'!!!");
			   }
			   catch(Exception e)
			   {
				   System.out.println("EXCEPTION FOUND: Cannot click the 'Proceed to checkout' button'!!!");
				   Assert.fail();
			   }
			System.out.println("----------Website successfully automated---------");
			driver.close();
		}


	}


