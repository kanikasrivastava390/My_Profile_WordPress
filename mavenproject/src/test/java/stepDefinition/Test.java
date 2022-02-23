package stepDefinition;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver;
		WebDriverWait wait;
	 WebElement username;
		Set<String> handles;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Selenium\\SupportingJars\\chromedriver\\chromedriver.exe");
		         driver = new ChromeDriver();
		        driver.get("https://wordpress.com/me");
		        Thread.sleep(3000);
		        driver.manage().window().maximize();
		     wait=new WebDriverWait(driver,20);
		    	 username=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("usernameOrEmail")));
		    	username.sendKeys("kanikasrivastava39");
		    	driver.findElement(By.xpath("//button[text()='Continue']")).click();
		    	wait=new WebDriverWait(driver,20);
		    	WebElement login=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Log In']")));
		    	WebElement password=driver.findElement(By.id("password"));
		    	password.sendKeys("nammyohorenge@39");
		    	login.click();
		         wait=new WebDriverWait(driver,20);
		    	WebElement my_profile=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='section-header__label-text'][contains(text(),'Profile')]")));
		    	WebElement help=driver.findElement(By.xpath("//button[@title='Help']"));
		    	try{Assert.assertTrue("Help icon is not enabled",help.isEnabled());}
		    	 catch(AssertionError e)
			    {System.out.println("Help icon is not enabled");
			    throw e;}
		    	help.click();
		    	Thread.sleep(3000);
		    	WebElement input=driver.findElement(By.xpath("//input[@placeholder='Search for help…']"));
		    	input.sendKeys("Checking");
		    	Thread.sleep(5000);
		    	try{Assert.assertEquals("Input field for help is not working as expected", "Checking", input.getAttribute("value"));}
		    	catch(AssertionError e)
			    {System.out.println("Input field for help is not working as expected");
			    throw e;}
		       
		    }
	}


