package practiceFirstMavenProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailLoginTest extends TestBase{
	
	@Test
	public void init(){
		GmailHomePage gmailHomePage = new GmailHomePage(driver);
		GmailLoginPage gmailLoginPage = gmailHomePage.clickSignInButton();
		gmailLoginPage.setEmail("abc@gmail.com");
		gmailLoginPage.clickOnNextButton();
		gmailLoginPage.setPassword("23456@qwe");
		GmailInboxPage gmailInboxPage = gmailLoginPage.clickOnNextButton();
		Assert.assertTrue(gmailInboxPage.gmailHeaderVisibility());
	}
	
	

}
