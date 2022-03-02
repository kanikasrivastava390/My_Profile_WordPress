package stepDefinition;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
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

	private Set<String> handles;

	@Given("^user is on landing page$")
	public void user_is_on_landing_page() throws Throwable {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("Url");
		if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get(url);
		Thread.sleep(3000);
		driver.manage().window().maximize();
	}

	@SuppressWarnings("deprecation")
	@Then("^user log in into application with username and password$")
	public void user_log_in_into_application_with_username_and_password() throws Throwable {
		PageObjects Page = PageFactory.initElements(driver, PageObjects.class);
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(Page.username));
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String Username = prop.getProperty("Username");
		Page.username.sendKeys(Username);
		Page.Continue.click();
		wait.until(ExpectedConditions.visibilityOf(Page.login));
		String Password = prop.getProperty("Password");
		Page.password.sendKeys(Password);
		Page.login.click();
	}

	@SuppressWarnings("deprecation")
	@When("^homepage is navigated$")
	public void homepage_is_populated() throws Throwable {
		PageObjects Page = PageFactory.initElements(driver, PageObjects.class);
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//span[@class='section-header__label-text'][contains(text(),'Profile')]")));
		Assert.assertEquals("Profile", Page.my_profile.getText());
	}

	@And("^Verify the heading of My Profile page$")
	public void verify_the_heading_of_my_profile_page() throws Throwable {
		PageObjects Page = PageFactory.initElements(driver, PageObjects.class);
		String heading = Page.heading.getText();
		try {
			Assert.assertEquals("Heading is not displaying correctly", "My Profile", heading);
		} catch (AssertionError e) {
			System.out.println("Not equal");
			throw e;
		}
	}

	@And("^Verify that My profile is selected by default in the side bar$")
	public void verify_that_my_profile_is_selected_by_default_in_the_side_bar() throws Throwable {
		PageObjects Page = PageFactory.initElements(driver, PageObjects.class);
		Boolean flag = Page.sidebar_MyProfile.getAttribute("class").toString().equals("selected");
		System.out.println(flag);
		try {
			Assert.assertTrue("My profile is not selected by default in the side bar", flag);
		} catch (AssertionError e) {
			System.out.println("Not Selected by Default");
			throw e;
		}
	}

	@Then("^verify the title of the page$")
	public void verify_the_title_of_the_page() throws Throwable {
		String title = driver.getTitle().toString();
		try {
			Assert.assertEquals("Title is not displaying correctly", "My Profile — WordPress.com", title);
		} catch (AssertionError e) {
			System.out.println("Not equal");
			throw e;
		}
	}

	@And("^Verify the name of my profile section$")
	public void verify_the_name_of_my_profile_section() throws Throwable {
		PageObjects Page = PageFactory.initElements(driver, PageObjects.class);
		try {
			Assert.assertEquals("Profile is not the name of profile My_Profile section", "Profile",
					Page.name_my_profile.getText());
		} catch (AssertionError e) {
			System.out.println("Name is not correct");
			throw e;
		}
	}

	@And("^Verify the input boxes and assosciated labels in my profile section$")
	public void verify_the_input_boxes_in_my_profile_section() throws Throwable {
		PageObjects Page = PageFactory.initElements(driver, PageObjects.class);
		boolean flag = Page.first_name.isEnabled();
		try {
			Assert.assertTrue("first_name is not enabled", flag);
		} catch (AssertionError e) {
			System.out.println("first_name is not enabled");
			throw e;
		}
		try {
			Assert.assertEquals("First name label is not correctly displaying", "First name",
					Page.first_name_label.getText());
		} catch (AssertionError e) {
			System.out.println("first name label is not displaying correctly");
			throw e;
		}
		flag = Page.last_name.isEnabled();
		try {
			Assert.assertTrue("last_name is not enabled", flag);
		} catch (AssertionError e) {
			System.out.println("last_name is not enabled");
			throw e;
		}
		String last_name_label = Page.last_name_label.getText();
		try {
			Assert.assertEquals("Last name label is not correctly displaying", "Last name", last_name_label);
		} catch (AssertionError e) {
			System.out.println("last name label is not displaying correctly");
			throw e;
		}
		flag = Page.display_name.isEnabled();
		try {
			Assert.assertTrue("display_name is not enabled", flag);
		} catch (AssertionError e) {
			System.out.println("display_name is not enabled");
			throw e;
		}
		try {
			Assert.assertEquals("Display name label is not correctly displaying", "Public display name",
					Page.display_name_label.getText());
		} catch (AssertionError e) {
			System.out.println("Display name label is not displaying correctly");
			throw e;
		}
		flag = Page.description.isEnabled();
		try {
			Assert.assertTrue("description is not enabled", flag);
		} catch (AssertionError e) {
			System.out.println("description is not enabled");
			throw e;
		}
		String About_me_level = Page.About_me_level.getText();
		try {
			Assert.assertEquals("About me label is not correctly displaying", "About me", About_me_level);
		} catch (AssertionError e) {
			System.out.println("About me label is not displaying correctly");
			throw e;
		}
	}

	@Then("^Verify that Public display name is autopopulated with username in my profile section$")
	public void verify_that_public_display_name_is_autopopulated_with_username_in_my_profile_section()
			throws Throwable {
		PageObjects Page = PageFactory.initElements(driver, PageObjects.class);
		String displayname = Page.display_name.getAttribute("value");
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String Username = prop.getProperty("Username");
		try {
			Assert.assertEquals("Public display name is not autopopulated with username", Username, displayname);
		} catch (AssertionError e) {
			System.out.println("Public display name is not autopopulated with username");
			throw e;
		}
	}

	@Then("^Verify Hide my Gravatar profile checkbox and message$")
	public void verify_hide_my_gravatar_profile_checkbox_and_message() throws Throwable {
		PageObjects Page = PageFactory.initElements(driver, PageObjects.class);
		try {
			Assert.assertEquals("Hide_profile is not a checkbox", "checkbox", Page.hide_profile.getAttribute("type"));
		} catch (AssertionError e) {
			System.out.println("Hide_profile is not a checkbox");
			throw e;
		}
		String hide_profile_message = Page.hide_profile_message.getText();
		try {
			Assert.assertEquals("Correct Message is not Displaying",
					"Hide my Gravatar profile. This will prevent your Gravatar profile and photo from appearing on any site. It may take some time for the changes to take effect. Gravatar profiles can be deleted at Gravatar.com.",
					hide_profile_message);
		} catch (AssertionError e) {
			System.out.println("Correct Message is not Displaying");
			throw e;
		}
	}

	@Then("^Verify that save button is disabled when no information is updated in input boxes$")
	public void verify_that_save_button_is_disabled_when_no_information_is_updated_in_input_boxes() throws Throwable {
		PageObjects Page = PageFactory.initElements(driver, PageObjects.class);
		try {
			Assert.assertFalse("Save button is not disabled by default", Page.savebutton.isEnabled());
		} catch (AssertionError e) {
			System.out.println("Save button is not disabled by default");
			throw e;
		}
	}

	@Then("^Verify that save button is enabled when information is updated in input boxes$")
	public void verify_that_save_button_is_enabled_when_information_is_updated_in_input_boxes() throws Throwable {
		PageObjects Page = PageFactory.initElements(driver, PageObjects.class);
		Page.first_name.clear();
		Thread.sleep(3000);
		Page.first_name.sendKeys("Kanikaa");
		Thread.sleep(8000);
		try {
			Assert.assertTrue("Save button is not enabled after updating input fields", Page.savebutton.isEnabled());
		} catch (AssertionError e) {
			System.out.println("Save button is not enabled after updating input fields");
			throw e;
		}
	}

	@Then("^Verify that there is a section with heading Profile Links$")
	public void verify_that_there_is_a_section_with_heading_profile_links() throws Throwable {
		PageObjects Page = PageFactory.initElements(driver, PageObjects.class);
		try {
			Assert.assertEquals("Profile links is not name of WebElement", "Profile links",
					Page.profile_links.getText());
		} catch (AssertionError e) {
			System.out.println("Profile links is not name of WebElement");
			throw e;
		}
		try {
			Assert.assertEquals("Webelement is not heading of section", "section-header__label-text",
					Page.profile_links.getAttribute("class"));
		} catch (AssertionError e) {
			System.out.println("WebElement is not heading of section");
			throw e;
		}
	}

	@Then("^Verify that Add link is present in heading Profile Links$")
	public void verify_that_add_link_is_present_in_heading_profile_links() throws Throwable {
		PageObjects Page = PageFactory.initElements(driver, PageObjects.class);
		try {
			Assert.assertEquals("Add is not name of link", Page.Add.getText(), "Add");
		} catch (AssertionError e) {
			System.out.println("Add is not name of link");
			throw e;
		}
		try {
			Assert.assertEquals("It is not an add outline link", Page.Add.getAttribute("class"),
					"section-header__actions");
		} catch (AssertionError e) {
			System.out.println("It is not an add outline link");
			throw e;
		}
	}

	@Then("^Verify the message displayed in section Profile Links when links are not present$")
	public void verify_the_message_displayed_in_heading_profile_links_when_no_links_are_present() throws Throwable {
		PageObjects Page = PageFactory.initElements(driver, PageObjects.class);
		String message = Page.message_noprofile_links.getText();
		try {
			Assert.assertEquals("Message is not displaying correctly when no links are present", message,
					"You have no sites in your profile links. You may add sites if you'd like.");
		} catch (AssertionError e) {
			System.out.println("Message is not displaying correctly when no links are present");
			throw e;
		}
	}

	@Then("^Verify that we can view the option to add wordpress site on clicking add$")
	public void Verify_that_we_can_view_the_option_to_add_wordpress() throws Throwable {
		PageObjects Page = PageFactory.initElements(driver, PageObjects.class);
		Page.Add.click();
		try {
			Assert.assertEquals("Add Wordpress site option is not displaying", Page.addwordpress.getText(),
					"Add WordPress Site");
		} catch (AssertionError e) {
			System.out.println("Add Wordpress site option is not displaying");
			throw e;
		}
	}

	@Then("^Verify the message and buttons that will be displayed when we click on add wordpress site$")
	public void verify_the_message_and_buttons_that_will_be_displayed_when_we_click_on_add_wordpress_site()
			throws Throwable {
		PageObjects Page = PageFactory.initElements(driver, PageObjects.class);
		boolean flag;

		/* To check the display of correct message */
		Page.Add.click();
		Page.addwordpress.click();
		String message = Page.message_profile_links.getText();
		if (message.contains(
				"You have no public sites on WordPress.com yet, but if you like you can create one now. You may also add self-hosted WordPress sites here after installing Jetpack on them."))

		{
			if (message.contains("Create SiteCancel"))
				flag = true;
			else
				flag = false;
		} else
			flag = false;
		try {
			Assert.assertTrue("Message is not displaying correctly when no links are present", flag);
		} catch (AssertionError e) {
			System.out.println("Message is not displaying correctly when no links are present");
			throw e;
		}
	}

	/* To check the functionality of Cancel Button */
	@SuppressWarnings("deprecation")
	@And("^Verify the functionality of Cancel button$")
	public void verify_the_functionality_of_cancel_button() throws Throwable {
		PageObjects Page = PageFactory.initElements(driver, PageObjects.class);
		Page.Cancel.click();
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(Page.message_noprofile_links));
		String message1 = Page.message_noprofile_links.getText();
		try {
			Assert.assertEquals("After Clicking Cancel,required message is not displaying", message1,
					"You have no sites in your profile links. You may add sites if you'd like.");
		} catch (AssertionError e) {
			System.out.println("After Clicking Cancel,required message is not displaying");
			throw e;
		}
	}

	/* To check the functionality of Create Button */
	@And("^Verify the functionality of Create button$")
	public void verify_the_functionality_of_create_button() throws Throwable {
		PageObjects Page = PageFactory.initElements(driver, PageObjects.class);
		Page.Add.click();
		Page.addwordpress.click();
		String window = driver.getWindowHandle();
		Page.Create.click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		for (String window1 : windows)
			if (window1 != window)
				driver.switchTo().window(window1);
		try {
			Assert.assertEquals("After Clicking Create,required new tab is not opening", driver.getTitle(),
					"WordPress.com");
		} catch (AssertionError e) {
			System.out.println("After Clicking Create,required new tab is not opening");
			throw e;
		}
	}

	@Then("^Verify that links are added in profile section if user wants to add$")
	public void verify_the_message_displayed_in_heading_profile_links_when_links_are_present() throws Throwable {
		PageObjects Page = PageFactory.initElements(driver, PageObjects.class);
		Page.Add.click();
		Page.addurl.click();
		Page.url.sendKeys("https://www.google.com");
		Page.description_url.sendKeys("Testing");
		Page.addSite.click();
		Thread.sleep(1000);
		boolean flag;
		int length = Page.link.size();
		System.out.println("The size is" + length);
		if (length > 0)
			flag = true;
		else
			flag = false;
		try {
			Assert.assertTrue("Links are not added in Profile Links", flag);
		} catch (AssertionError e) {
			System.out.println("Links are not added in Profile Links");
			throw e;
		}
		Thread.sleep(1000);
		Page.removeElement.click();
		Thread.sleep(3000);
	}

	@Then("^Verify the common message displayed$")
	public void verify_the_common_message_displayed() throws Throwable {
		PageObjects Page = PageFactory.initElements(driver, PageObjects.class);
		String common_message = Page.common_message.getText();
		try {
			Assert.assertEquals("Common message is not displaying correctly", common_message,
					"Manage which sites appear in your profile.");
		} catch (AssertionError e) {
			System.out.println("Common message is not displaying correctly");
			throw e;
		}
	}

	@And("^On clicking save button is disabled again and updated values are stored in input boxes$")
	public void on_clicking_save_buton_is_disabled_again_and_updated_values_are_stored_in_input_boxes()
			throws Throwable {
		PageObjects Page = PageFactory.initElements(driver, PageObjects.class);
		Page.savebutton.click();
		Thread.sleep(3000);
		try {
			Assert.assertEquals("Updated values are not saved after clicking Save", "Kanikaa",
					Page.first_name.getAttribute("value"));
		} catch (AssertionError e) {
			System.out.println("Updated values are not saved after clicking Save");
			throw e;
		}
		try {
			Assert.assertFalse("Save button is disabled by default", Page.savebutton.isEnabled());
		} catch (AssertionError e) {
			System.out.println("Save button is not disabled by default");
			throw e;
		}
		Page.first_name.clear();
		Page.savebutton.click();
		Thread.sleep(3000);
	}

	@Then("^Verify the help icon$")
	public void verify_the_help_icon() throws Throwable {
		PageObjects Page = PageFactory.initElements(driver, PageObjects.class);
		try {
			Assert.assertTrue("Help icon is not enabled", Page.help.isEnabled());
		} catch (AssertionError e) {
			System.out.println("Help icon is not enabled");
			throw e;
		}
		Page.help.click();
		Thread.sleep(3000);
		Page.input.sendKeys("Checking");
		Thread.sleep(5000);
		try {
			Assert.assertEquals("Input field for help is not working as expected", "Checking",
					Page.input.getAttribute("value"));
		} catch (AssertionError e) {
			System.out.println("Input field for help is not working as expected");
			throw e;
		}
	}

	@Then("^Verify click to change photo icon and assosciated messages$")
	public void verify_click_to_change_photo_icon_and_assosciated_messages() throws Throwable {
		PageObjects Page = PageFactory.initElements(driver, PageObjects.class);
		try {
			Assert.assertTrue("click_to_change_photo icon is not enabled", Page.click_to_change_photo.isEnabled());
		} catch (AssertionError e) {
			System.out.println("click_to_change_photo icon is not enabled");
			throw e;
		}
		try {
			Assert.assertEquals("Photo Message is not correct", "Your profile photo is public.",
					Page.photo_message.getText());
		} catch (AssertionError e) {
			System.out.println("Photo Message is not correct");
			throw e;
		}
		Page.hovover.click();
		System.out.println(Page.tooltip.getText());
		try {
			Assert.assertNotNull(Page.tooltip.getText());
		} catch (AssertionError e) {
			System.out.println("Hovover Message is not correct");
			throw e;
		}
	}

	@After
	public void close_all_instances_of_browser() throws Throwable {
		handles = driver.getWindowHandles();
		System.out.println(handles);
		if (handles.isEmpty()) {

			System.out.print("All Browser windows are already closed ");
		} else
			driver.quit();
		System.out.print("Closed All windows ");
	}
}
