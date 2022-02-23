package stepDefinition;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import junit.framework.Assert;

public class stepDefination {
	private static WebDriver driver;
	private WebDriverWait wait;
	private static WebElement username;
	private static WebElement savebutton;
	private static WebElement first_name;
	private Set<String> handles;
	 @Given("^user is on landing page$")
	    public void user_is_on_landing_page() throws Throwable {
	        
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Selenium\\SupportingJars\\chromedriver\\chromedriver.exe");
	         driver = new ChromeDriver();
	        driver.get("https://wordpress.com/me");
	        Thread.sleep(3000);
	        driver.manage().window().maximize();
	        
	      
	        
	    }

	    @When("^user log in into application with username and password$")
	    public void user_log_in_into_application_with_username_and_password() throws Throwable {
	    	wait=new WebDriverWait(driver,20);
	    	 username=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("usernameOrEmail")));
	    	username.sendKeys("kanikasrivastava39");
	    	driver.findElement(By.xpath("//button[text()='Continue']")).click();
	    	WebElement login=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Log In']")));
	    	WebElement password=driver.findElement(By.id("password"));
	    	password.sendKeys("nammyohorenge@39");
	    	login.click();
	    	 }

	    @SuppressWarnings("deprecation")
		@Then("^homepage is navigated$")
	    public void homepage_is_populated() throws Throwable {
	    	wait=new WebDriverWait(driver,20);
	    	WebElement my_profile=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='section-header__label-text'][contains(text(),'Profile')]")));
	    	Assert.assertEquals("Profile", my_profile.getText());
	       
	    }
	    
	    @Then("^Verify the heading of My Profile page$")
	    public void verify_the_heading_of_my_profile_page() throws Throwable {
	    	String heading=driver.findElement(By.xpath("//*[@id='primary']/main/header/h1")).getText();
	    	try{Assert.assertEquals("Heading is not displaying correctly","My Profile", heading);}
	    	catch(AssertionError e)
	    	{System.out.println("Not equal");
	    	throw e;}
	    	
	       
	        
	    }
	    
	    @Then("^Verify that My profile is selected by default in the side bar$")
	    public void verify_that_my_profile_is_selected_by_default_in_the_side_bar() throws Throwable {
	    	String flag1=driver.findElement(By.xpath("(//span[text()='My Profile'])[2]/../..")).getAttribute("class");
	    	Boolean flag=driver.findElement(By.xpath("(//span[text()='My Profile'])[2]/../..")).getAttribute("class").toString().equals("selected");
	    	System.out.println(flag);
	    	try{Assert.assertTrue("My profile is not selected by default in the side bar",flag);}
	    	catch(AssertionError e)
	    	{System.out.println("Not Selected by Default");
	    	throw e;}
	    	
	       
	     
	    }
	    
	    @Then("^verify the title of the page$")
	    public void verify_the_title_of_the_page() throws Throwable {
	    	String title=driver.getTitle().toString();
	    	try{Assert.assertEquals("Title is not displaying correctly","My Profile — WordPress.com", title);}
	    	catch(AssertionError e)
	    	{System.out.println("Not equal");
	    	throw e;}
	    	
	       
	    }
	    
	    @Then("^Verify the name of my profile section$")
	    public void verify_the_name_of_my_profile_section() throws Throwable {
	    	WebElement name_my_profile=driver.findElement(By.xpath("//span[@class='section-header__label-text'][contains(text(),'Profile')]"));
	    	try{Assert.assertEquals("Profile is not the name of profile My_Profile section","Profile", name_my_profile.getText());}
	    	catch(AssertionError e)
	    	{System.out.println("Name is not correct");
	    	throw e;}
	    	
	         
	    }

	    @Then("^Verify the input boxes and assosciated labels in my profile section$")
	    public void verify_the_input_boxes_in_my_profile_section() throws Throwable {
	    	first_name=driver.findElement(By.id("first_name"));
	    	boolean flag=first_name.isEnabled();
	    	try{Assert.assertTrue("first_name is not enabled", flag);}
	    	catch(AssertionError e)
	    	{System.out.println("first_name is not enabled");
	    	throw e;}
	    	String first_name_label=driver.findElement(By.xpath("//*[@id='first_name']/preceding-sibling::label")).getText();
	    	try{Assert.assertEquals("First name label is not correctly displaying","First name",first_name_label );}
	    	catch(AssertionError e)
	    	{System.out.println("first name label is not displaying correctly");
	    	throw e;}
	    	WebElement last_name=driver.findElement(By.id("last_name"));
	    	flag=last_name.isEnabled();
	    	try{Assert.assertTrue("last_name is not enabled", flag);}
	    	catch(AssertionError e)
	    	{System.out.println("last_name is not enabled");
	    	throw e;}
	    	String last_name_label=driver.findElement(By.xpath("//*[@id='last_name']/preceding-sibling::label")).getText();
	    	try{Assert.assertEquals("Last name label is not correctly displaying","Last name",last_name_label );}
	    	catch(AssertionError e)
	    	{System.out.println("last name label is not displaying correctly");
	    	throw e;}
	    	WebElement display_name=driver.findElement(By.id("display_name"));
	    	flag=display_name.isEnabled();
	    	try{Assert.assertTrue("display_name is not enabled", flag);}
	    	catch(AssertionError e)
	    	{System.out.println("display_name is not enabled");
	    	throw e;}
	    	String display_name_label=driver.findElement(By.xpath("//*[@id='display_name']/preceding-sibling::label")).getText();
	    	try{Assert.assertEquals("Display name label is not correctly displaying","Public display name",display_name_label );}
	    	catch(AssertionError e)
	    	{System.out.println("Display name label is not displaying correctly");
	    	throw e;}
	    	
	    	WebElement description=driver.findElement(By.id("description"));
	    	flag=description.isEnabled();
	    	try{Assert.assertTrue("description is not enabled", flag);}
	    	catch(AssertionError e)
	    	{System.out.println("description is not enabled");
	    	throw e;}
	    	String About_me_level=driver.findElement(By.xpath("//*[@id='description']/preceding-sibling::label")).getText();
	    	try{Assert.assertEquals("About me label is not correctly displaying","About me",About_me_level );}
	    	catch(AssertionError e)
	    	{System.out.println("About me label is not displaying correctly");
	    	throw e;}
	    	
	       
	    }

	    @Then("^Verify that Public display name is autopopulated with username in my profile section$")
	    public void verify_that_public_display_name_is_autopopulated_with_username_in_my_profile_section() throws Throwable {
	    	WebElement display_name=driver.findElement(By.id("display_name"));
	    	String displayname=display_name.getAttribute("value");
	    	try{Assert.assertEquals("Public display name is not autopopulated with username","kanikasrivastava39",displayname );}
	    	catch(AssertionError e)
	    	{System.out.println("Public display name is not autopopulated with username");
	    	throw e;}
	    	
	    }

	    @Then("^Verify Hide my Gravatar profile checkbox and message$")
	    public void verify_hide_my_gravatar_profile_checkbox_and_message() throws Throwable {
	    	WebElement hide_profile=driver.findElement(By.xpath("//*[@id='inspector-toggle-control-0']"));
	    	try{Assert.assertEquals("Hide_profile is not a checkbox","checkbox",hide_profile.getAttribute("type") );}
	    	catch(AssertionError e)
	    	{System.out.println("Hide_profile is not a checkbox");
	    	throw e;}
	    	String hide_profile_message=driver.findElement(By.xpath("//*[@id='inspector-toggle-control-0']/parent::span/following-sibling::label")).getText();
	    	try{Assert.assertEquals("Correct Message is not Displaying","Hide my Gravatar profile. This will prevent your Gravatar profile and photo from appearing on any site. It may take some time for the changes to take effect. Gravatar profiles can be deleted at Gravatar.com."
,hide_profile_message );}
	    	catch(AssertionError e)
	    	{System.out.println("Correct Message is not Displaying");
	    	throw e;}
	    }

	    @Then("^Verify that save button is disabled when no information is updated in input boxes$")
	    public void verify_that_save_button_is_disabled_when_no_information_is_updated_in_input_boxes() throws Throwable {
	     savebutton=driver.findElement(By.xpath("//button[text()='Save profile details']"));
	    try{ Assert.assertFalse("Save button is not disabled by default", savebutton.isEnabled());}
	    catch(AssertionError e)
	    {System.out.println("Save button is not disabled by default");
	    throw e;}
	       
	    }

	    @Then("^Verify that save button is enabled when information is updated in input boxes$")
	    public void verify_that_save_button_is_enabled_when_information_is_updated_in_input_boxes() throws Throwable {
	    	first_name=driver.findElement(By.id("first_name"));
	    	first_name.clear();
	    	Thread.sleep(3000);
	    	first_name.sendKeys("Kanikaa");
	    	Thread.sleep(8000);
	    	savebutton=driver.findElement(By.xpath("//button[text()='Save profile details']"));
		    try{ Assert.assertTrue("Save button is not enabled after updating input fields", savebutton.isEnabled());}
		    catch(AssertionError e)
		    {System.out.println("Save button is not enabled after updating input fields");
		    throw e;}
		       
	       
	    }

	    @Then("^Verify that there is a section with heading Profile Links$")
	    public void verify_that_there_is_a_section_with_heading_profile_links() throws Throwable {
	       WebElement profile_links=driver.findElement(By.xpath("//span[text()='Profile links']"));
	       try{Assert.assertEquals("Profile links is not name of WebElement","Profile links", profile_links.getText());}
	       catch(AssertionError e)
		    {System.out.println("Profile links is not name of WebElement");
		    throw e;}
		       
	       try{Assert.assertEquals("Webelement is not heading of section","section-header__label-text", profile_links.getAttribute("class"));}
	       catch(AssertionError e)
		    {System.out.println("WebElement is not heading of section");
		    throw e;}
		      }

	    @Then("^Verify that Add link is present in heading Profile Links$")
	    public void verify_that_add_link_is_present_in_heading_profile_links() throws Throwable {
	    	WebElement Add=driver.findElement(By.xpath("//span[text()='Profile links']/parent::div/following-sibling::div"));
	    	try{ Assert.assertEquals("Add is not name of link", Add.getText(),"Add");}
	    	 catch(AssertionError e)
		    {System.out.println("Add is not name of link");
		    throw e;}
		    try{Assert.assertEquals("It is not an add outline link", Add.getAttribute("class"),"section-header__actions");}
		       catch(AssertionError e)
			    {System.out.println("It is not an add outline link");
			    throw e;}
			   
	    }

	    @Then("^Verify the message displayed in section Profile Links when links are not present$")
	    public void verify_the_message_displayed_in_heading_profile_links_when_no_links_are_present() throws Throwable {
	    	String message=driver.findElement(By.xpath("//span[text()='Profile links']/parent::div/parent::div/following-sibling::div/div/p[2]")).getText();
	        try{Assert.assertEquals("Message is not displaying correctly when no links are present", message,"You have no sites in your profile links. You may add sites if you'd like.");}
		       catch(AssertionError e)
			    {System.out.println("Message is not displaying correctly when no links are present");
			    throw e;}}
	    
	    @Then("^Verify that we can view the option to add wordpress site on clicking add$")
	    public void Verify_that_we_can_view_the_option_to_add_wordpress() throws Throwable {
	    	WebElement Add=driver.findElement(By.xpath("//span[text()='Profile links']/parent::div/following-sibling::div"));
	    	Add.click();
	    	WebElement addwordpress=driver.findElement(By.xpath("//button[text()='Add WordPress Site']"));
	    	  try{Assert.assertEquals("Add Wordpress site option is not displaying",addwordpress.getText(),"Add WordPress Site");}
		       catch(AssertionError e)
			    {System.out.println("Add Wordpress site option is not displaying");
			    throw e;}
	    	  }
	    
	    @Then("^Verify the message and buttons that will be displayed when we click on add wordpress site$")
	    public void verify_the_message_and_buttons_that_will_be_displayed_when_we_click_on_add_wordpress_site() throws Throwable {
	    	boolean flag;
	    	WebElement Add=driver.findElement(By.xpath("//span[text()='Profile links']/parent::div/following-sibling::div"));
	    	Add.click();
	    	WebElement addwordpress=driver.findElement(By.xpath("//button[text()='Add WordPress Site']"));
	    	addwordpress.click();
	    	String message=driver.findElement(By.xpath("//span[text()='Profile links']/parent::div/parent::div/following-sibling::div/div")).getText();
	    	if(message.contains("You have no public sites on WordPress.com yet, but if you like you can create one now. You may also add self-hosted WordPress sites here after installing Jetpack on them."))
	    		
	    	{if(message.contains("Create SiteCancel"))
	    		flag=true;
	    	else
	    		flag=false;}
	    	else flag=false;
	        try{Assert.assertTrue("Message is not displaying correctly when no links are present", flag);
	       		}
		       catch(AssertionError e)
			    {System.out.println("Message is not displaying correctly when no links are present");
			    throw e;}
	        
	    }

	    	
	    	
	    

	    @Then("^Verify that links are added in profile section if user wants to add$")
	    public void verify_the_message_displayed_in_heading_profile_links_when_links_are_present() throws Throwable {
	    	WebElement Add=driver.findElement(By.xpath("//span[text()='Profile links']/parent::div/following-sibling::div"));
	    	Add.click();
	    	WebElement addurl=driver.findElement(By.xpath("//button[text()='Add URL']"));
	    	addurl.click();
	    	WebElement url=driver.findElement(By.xpath("//input[@placeholder='Enter a URL']"));
	    	url.sendKeys("https://www.google.com");
	    	WebElement description=driver.findElement(By.xpath("//input[@placeholder='Enter a description']"));
	    	description.sendKeys("Testing");
	    	WebElement addSite=driver.findElement(By.xpath("//button[text()='Add Site']"));
	    	addSite.click();
	    	Thread.sleep(1000);
	    	List<WebElement> link=driver.findElements(By.xpath("//button[@class='button profile-link__remove is-borderless']/preceding-sibling::a"));
	    	
	    	boolean flag;
	    	int length=link.size();
	    	System.out.println("The size is"+length);
	    	if(length>0)
	    	 flag=true;
	    	else
	    		flag=false;
	    	try{Assert.assertTrue("Links are not added in Profile Links", flag);}
	    	catch(AssertionError e)
	    	{System.out.println("Links are not added in Profile Links");
	    	throw e;}
	    	Thread.sleep(1000);
	    	WebElement removeElement=driver.findElement(By.xpath("//button[@class='button profile-link__remove is-borderless']"));
	    	removeElement.click();
	    	Thread.sleep(3000);
		    
	    }
	    
	    @Then("^Verify the common message displayed$")
	    public void verify_the_common_message_displayed() throws Throwable {
	        String common_message=driver.findElement(By.xpath("//span[text()='Profile links']/parent::div/parent::div/following-sibling::div/div/p")).getText();
	        try{Assert.assertEquals("Common message is not displaying correctly", common_message,"Manage which sites appear in your profile.");}
		       catch(AssertionError e)
			    {System.out.println("Common message is not displaying correctly");
			    throw e;}}

	    @And("^On clicking save button is disabled again and updated values are stored in input boxes$")
	    public void on_clicking_save_buton_is_disabled_again_and_updated_values_are_stored_in_input_boxes() throws Throwable {
	    	savebutton=driver.findElement(By.xpath("//button[text()='Save profile details']"));
		    savebutton.click();
		    Thread.sleep(3000);
		    first_name=driver.findElement(By.id("first_name"));
		   try{Assert.assertEquals("Updated values are not saved after clicking Save","Kanikaa", first_name.getAttribute("value"));}
	       catch(AssertionError e)
	       {System.out.println("Updated values are not saved after clicking Save");
	       throw e;}
	        try{ Assert.assertFalse("Save button is disabled by default", savebutton.isEnabled());}
		    catch(AssertionError e)
		    {System.out.println("Save button is not disabled by default");
		    throw e;}
		    first_name.clear();
		    savebutton.click();
		    Thread.sleep(3000);
		    
	    }
	    
	    @Then("^Verify the help icon$")
	    public void verify_the_help_icon() throws Throwable {
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

	    @Then("^Verify click to change photo icon and assosciated messages$")
	    public void verify_click_to_change_photo_icon_and_assosciated_messages() throws Throwable {
	    	WebElement click_to_change_photo=driver.findElement(By.xpath("//span[text()='Click to change photo']")) ;
		       try{Assert.assertTrue("click_to_change_photo icon is not enabled",click_to_change_photo.isEnabled());}
		    	 catch(AssertionError e)
			    {System.out.println("click_to_change_photo icon is not enabled");
			    throw e;}
		       WebElement photo_message=driver.findElement(By.xpath("//span[text()='Click to change photo']/ancestor::div[3]/following-sibling::div/p"));
		       try{Assert.assertEquals("Photo Message is not correct", "Your profile photo is public.", photo_message.getText());}
		    	catch(AssertionError e)
			    {System.out.println("Photo Message is not correct");
			    throw e;}
		       WebElement hovover=driver.findElement(By.xpath("//span[text()='Click to change photo']/ancestor::div[3]/following-sibling::div/p/following-sibling::button"));
		       hovover.click();
		       WebElement tooltip=driver.findElement(By.xpath("//div[@role='tooltip']"));
		       System.out.println(tooltip.getText());
		       try{Assert.assertNotNull(tooltip.getText());}
		    	   catch(AssertionError e)
		       
			    {System.out.println("Hovover Message is not correct");
			    throw e;}
	    }


	    @After
	    public void close_all_instances_of_browser() throws Throwable {
	    	handles = driver.getWindowHandles();
	    	System.out.println(handles);
	    	if(handles.isEmpty())
	    	{

	    	System.out.print("All Browser windows are already closed ");
	    	}
	    	else
	    		driver.quit();
	    	System.out.print("Closed All windows ");
	    		
	       
	    }
	       
	    }



