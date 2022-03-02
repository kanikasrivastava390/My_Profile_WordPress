package stepDefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class PageObjects {
	WebDriver driver;

	public PageObjects(WebDriver driver) {
		super();
		this.driver = driver;
	}

	@FindBy(id = "usernameOrEmail")
	WebElement username;

	@FindBy(xpath = "//button[text()='Continue']")
	WebElement Continue;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "//button[text()='Log In']")
	WebElement login;

	@FindBy(xpath = "//span[@class='section-header__label-text'][contains(text(),'Profile')]")
	WebElement my_profile;

	@FindBy(xpath = "//*[@id='primary']/main/header/h1")
	WebElement heading;

	@FindBy(xpath = "(//span[text()='My Profile'])[2]/../..")
	WebElement sidebar_MyProfile;

	@FindBy(xpath = "//span[@class='section-header__label-text'][contains(text(),'Profile')]")
	WebElement name_my_profile;

	@FindBy(id = "first_name")
	WebElement first_name;

	@FindBy(xpath = "//*[@id='first_name']/preceding-sibling::label")
	WebElement first_name_label;

	@FindBy(id = "last_name")
	WebElement last_name;

	@FindBy(xpath = "//*[@id='last_name']/preceding-sibling::label")
	WebElement last_name_label;

	@FindBy(id = "display_name")
	WebElement display_name;

	@FindBy(xpath = "//*[@id='display_name']/preceding-sibling::label")
	WebElement display_name_label;

	@FindBy(id = "description")
	WebElement description;

	@FindBy(xpath = "//*[@id='description']/preceding-sibling::label")
	WebElement About_me_level;

	@FindBy(xpath = "//*[@id='inspector-toggle-control-0']")
	WebElement hide_profile;

	@FindBy(xpath = "//*[@id='inspector-toggle-control-0']/parent::span/following-sibling::label")
	WebElement hide_profile_message;

	@FindBy(xpath = "//button[text()='Save profile details']")
	WebElement savebutton;

	@FindBy(xpath = "//span[text()='Profile links']")
	WebElement profile_links;

	@FindBy(xpath = "//span[text()='Profile links']/parent::div/parent::div/following-sibling::div/div/p[2]")
	WebElement message_noprofile_links;

	@FindBy(xpath = "//span[text()='Profile links']/parent::div/following-sibling::div")
	WebElement Add;

	@FindBy(xpath = "//button[text()='Add WordPress Site']")
	WebElement addwordpress;

	@FindBy(xpath = "//span[text()='Profile links']/parent::div/parent::div/following-sibling::div/div")
	WebElement message_profile_links;

	@FindBy(xpath = "//button[text()='Add URL']")
	WebElement addurl;

	@FindBy(xpath = "//input[@placeholder='Enter a URL']")
	WebElement url;

	@FindBy(xpath = "//input[@placeholder='Enter a description']")
	WebElement description_url;

	@FindBy(xpath = "//button[text()='Add Site']")
	WebElement addSite;

	@FindBys(@FindBy(xpath = "//button[@class='button profile-link__remove is-borderless']/preceding-sibling::a"))
	List<WebElement> link;

	@FindBy(xpath = "//button[@class='button profile-link__remove is-borderless']")
	WebElement removeElement;

	@FindBy(xpath = "//span[text()='Profile links']/parent::div/parent::div/following-sibling::div/div/p")
	WebElement common_message;

	@FindBy(xpath = "//button[text()='Create Site']")
	WebElement Create;

	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement Cancel;

	@FindBy(xpath = "//button[@title='Help']")
	WebElement help;

	@FindBy(xpath = "//input[@placeholder='Search for help…']")
	WebElement input;

	@FindBy(xpath = "//span[text()='Click to change photo']")
	WebElement click_to_change_photo;

	@FindBy(xpath = "//span[text()='Click to change photo']/ancestor::div[3]/following-sibling::div/p")
	WebElement photo_message;

	@FindBy(xpath = "//span[text()='Click to change photo']/ancestor::div[3]/following-sibling::div/p/following-sibling::button")
	WebElement hovover;

	@FindBy(xpath = "//div[@role='tooltip']")
	WebElement tooltip;
}