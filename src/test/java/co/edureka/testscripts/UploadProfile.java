package co.edureka.testscripts;

import org.testng.annotations.Test;

import co.edureka.generics.BaseTest;
import co.edureka.pompages.LoginPage;
import co.edureka.pompages.ProfilePage;

public class UploadProfile extends BaseTest {
	LoginPage loginPage = null;
	ProfilePage profilePage = null;


	@Test(dataProvider="getData")
	public void TC01_Upload_Profile(String userid, String password) 
	{
		loginPage = new LoginPage(driver);
		profilePage = new ProfilePage(driver);
		
		try {
			
			loginPage.clickLogin();
			loginPage.enterEmail(userid);
			loginPage.enterPasswd(password);
			loginPage.clickLoginButton();
			loginPage.verifyTitle("Instructor");
			
			profilePage.clickProfileButton();
			profilePage.clickMyProfileButton();
			profilePage.clickEditProfileButton();
			profilePage.clickCameraButton();
			profilePage.clickChooseFileButton();
			
			profilePage.runAutoIT();
			profilePage.clickUploadButton();
			profilePage.clickContinueButton();
			profilePage.clickNextButton();
			profilePage.clickNext();
			profilePage.clickSaveButton();
			
			
		} catch (Exception e) {
		
		}
	}


}
