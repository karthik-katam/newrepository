package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	public WebDriver driver;
	public JavascriptExecutor jse;
	 
	By DealMarcker_Signup = By.xpath(
			"//header[@class='header']//div[@class='user-options non-logged-in-user-options']//a[@class='btn sign-up-btn']");
	By LinkedIn_btn = By.xpath(
			"//div[@class='form-container']//div[@class='linkedin-btn-container']//div[@class='linkedin-btn-text']");
	By Linked_Email = By.xpath("//form[@class='login__form']//div//input[@id='username']");
	By Linked_Password = By.xpath("//form[@class='login__form']//div//input[@id='password']");
	By SignIn_Btn = By.xpath("//button[@type='submit']");
	By termsPopUp=By.xpath("//div[@id='contact-us-form-container']");

	By See_yourselfLink = By.xpath("//div[@class='before-footer']//a[@class='see-for-yourself']");
	By First_Name=By.xpath("//input[@id='FirstName']");
	By Last_Name=By.xpath("//input[@id='LastName']");
	By Email_ID=By.xpath("//input[@id='Email']");
	By Thanks_Popup=By.xpath("//div[@class='container']//div[@class='content__inner']");
	By Product_Announcement=By.xpath("//section[@class='product-announcement-section before-footer']");
	
	

	public void browserInit() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthik\\teletextautomation\\BDD_PropertyCapsule_Framework\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.propertycapsule.com/");

	}

	public void verifyTitle() {
		String title = driver.getTitle();
		System.out.println("Title of the page: " + title);

	}

	public void clickOnSignup() {
		WebElement Deal_signUp = driver.findElement(DealMarcker_Signup);
		Deal_signUp.click();
	}

	public void clickOnLinkedInTab() {
		WebElement LinkedIn_Tab = driver.findElement(LinkedIn_btn);
		LinkedIn_Tab.click();
	}

	public void enterEmail(String email) {
		WebElement emailID = driver.findElement(Linked_Email);
		emailID.sendKeys(email);
	}

	public void enterPassword(String pass) {
		WebElement password = driver.findElement(Linked_Password);
		password.sendKeys(pass);
	}

	public void clickLinkedInSignIn() {
		WebElement SignIn = driver.findElement(SignIn_Btn);
		SignIn.click();
	}
	
	public void clickSeeYourself() {
		WebElement SeeYourself=driver.findElement(See_yourselfLink);
		jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", SeeYourself);
		SeeYourself.click();
	}
	
	public Boolean termsPopup() {
	WebElement TermsPopup=driver.findElement(termsPopUp);
	if(TermsPopup.isDisplayed()) {
		return true;
	}
	return false;
	}
	public void enterFirstName(String first) {
		WebElement FirstName=driver.findElement(First_Name);
		FirstName.sendKeys(first);
	}
	public void enterLastName(String last) {
		WebElement LastName=driver.findElement(Last_Name);
		LastName.sendKeys(last);
	}
	public void enterWorkEmail(String email) {
		WebElement WorkEmail=driver.findElement(Email_ID);
		WorkEmail.sendKeys(email);
	}
	
	public Boolean verifyThanksPopup() {
		WebElement ThanksPopup=driver.findElement(Thanks_Popup);
		if(ThanksPopup.isDisplayed()) {
			return true;
		}
		return false;
		}
	
	public Boolean verifyProductAnnouncement() {
		jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", Product_Announcement);
		if(driver.findElement(Product_Announcement).isDisplayed()) {
			return true;
		}
		return false;
	}
	public void getAllLinks() {
	
		List<WebElement> links=driver.findElements(By.tagName("a"));
		 System.out.println(links.size());
		 for (int i = 0; i<=links.size(); i=i++)
		 {
		 System.out.println(links.get(i).getText());
		 }
	}

	public void closeBrowser() {
		driver.close();
	}

}
