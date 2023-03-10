package byjusPomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage
{

	@FindBy(xpath = "//a[@class='navbar-brand']")
	private WebElement branding;
	public WebElement getBrandingElement()
	{
		return branding;
	}

	@FindBy(xpath = "//a[text()='Study Materials']")
	private WebElement studymaterial;
	public WebElement getStudyMaterialElement()
	{
		return studymaterial;
	}

	@FindBy(xpath = "(//a[@role='button'])[2]")
	private WebElement byjuanswer;
	public WebElement getByjuAnswerElement()
	{
		return byjuanswer;
	}

	@FindBy(xpath = "//a[text()='Scholarship']")
	private WebElement scolership;
	public WebElement getScolershipElement()
	{
		return scolership;
	}

	@FindBy(xpath = "//a[text()='BTC ']")
	private WebElement btc;
	public WebElement getBtcElement()
	{
		return btc;
	}

	@FindBy(xpath = "//a[text()='Buy a Course ']")
	private WebElement buyacourse;
	public WebElement getBuyACourseElement()
	{
		return buyacourse;
	}

	@FindBy(xpath = "//a[text()='Success Stories ']")
	private WebElement Successstories;
	public WebElement getSuccessStoriesElement()
	{
		return Successstories;
	}

	@FindBy(xpath = "//input[@name='name']")
	private WebElement name;
	public WebElement getNameElement()
	{
		return name;
	}

	@FindBy(xpath = "//input[@name='mobile']")
	private WebElement mobile;
	public WebElement getMobileElement()
	{
		return mobile;
	}
	
	//advkjadvjknadvn

	@FindBy(name = "email")
	private WebElement email;
	public WebElement getEmailElement()
	{
		return email;
	}

	@FindBy(name = "//select[@name='state']")
	private WebElement state;
	public WebElement getStateElement()
	{
		return state;
	}

	@FindBy(xpath = "//a[text()='IAS']")
	private WebElement ias;
	public WebElement getIASElement()
	{
		return ias;
	}

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
