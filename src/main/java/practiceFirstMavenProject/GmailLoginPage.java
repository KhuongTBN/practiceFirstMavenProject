package practiceFirstMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLoginPage {
	
	WebDriver driver;

	@FindBy(xpath = "// input[@type='email']")
	WebElement emailTextBox;
	
	@FindBy(xpath = "// input[@type='password']")
	WebElement passwordTextBox;

	@FindBy(xpath = "// div[@role = 'button' and @id = 'identifierNext']")
	WebElement nextButton;
	
	public GmailLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setEmail(String strEmail) {
		emailTextBox.sendKeys(strEmail);
	}

	public void setPassword(String strPassword){
		passwordTextBox.sendKeys(strPassword);
	}
	
	public GmailInboxPage clickOnNextButton(){
		nextButton.click();
		return new GmailInboxPage(driver);
	}
	
}
