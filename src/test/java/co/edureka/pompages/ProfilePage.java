	package co.edureka.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.edureka.generics.BasePage;

public class ProfilePage extends BasePage {

	public ProfilePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

//* ******************************************************************************************************************
//                                                                                Declare	WebElements
//*******************************************************************************************************************
	
	
//profile Button 
	@FindBy(xpath = ("//a[@data-button-name='Profile picture']"))
	private WebElement profileButton;

//MyProfile Button 
	@FindBy(xpath = ("(//a[@data-button-name='My Profile'])[1]"))
	private WebElement myProfileButton;
	
// Edit Profile Button  	
	@FindBy(xpath = ("(//a[@class='profile-edit-icon'])[1]"))
	private WebElement editProfileButton;

//camera Button click 	
	@FindBy(xpath = ("//i[@class='icon-camera']"))
	private WebElement cameraButton;
	
//choosefile
	@FindBy(id="custom-input")
	private WebElement chooseFileButton;
	
//UploadButton
	@FindBy(xpath="//button[@class='submitbtn']")
	private WebElement uploadButton;

//ContinueButton
	@FindBy(xpath="//button[@class='btn btn-default pull-right verify-continue-btn']")
	private WebElement continueButton;
	
	//nextButton
	@FindBy(xpath="//button[@class='btn pull-right onboarding-primary-button']")
	private WebElement nextButton;
	
	//next
	@FindBy(xpath="//button[@class='btn onboarding-primary-button pull-right']")
	private WebElement next;
	
	//save
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement saveButton;
	
//* ***************************** ************************************************************************************
//                                                            Declare	Methods
//*******************************************************************************************************************
	
//Profile Button 
	public void clickProfileButton() {
		try {
			verifyElementPresent(profileButton);
			profileButton.click();
			Thread.sleep(1000);
			log.info("Profile Button Clicked");
		} catch (Exception e) {
			log.error("Profile Button not Clickable");
		}
	}
	

	//MyProfile Button 
		public void clickMyProfileButton() {
			try {
				verifyElementPresent(myProfileButton);
				myProfileButton.click();
				Thread.sleep(1000);
				log.info("MyProfile Button Clicked");
			} catch (Exception e) {
				log.error("MyProfile Button not Clickable");
			}
		}
		

//Edit ProfileButton	
	public void clickEditProfileButton() {
		try {
			verifyElementPresent(editProfileButton);
			editProfileButton.click();
			Thread.sleep(1000);
			log.info("Edit Button Clicked");
		} catch (Exception e) {
			log.error("Not able to click edit button");
		}
	}

	//camera button
		public void clickCameraButton() {
			try {
				verifyElementPresent(cameraButton);
				cameraButton.click();
				Thread.sleep(500);
				log.info("camera Button Clicked");
			} catch (Exception e) {
				log.error("Not able to click camera button");
			}
		}	
		
		//choosefile button
		public void clickChooseFileButton() {
			try {
				verifyElementPresent(chooseFileButton);
				chooseFileButton.click();
				Thread.sleep(500);
				log.info("choosefile Button Clicked");
			} catch (Exception e) {
				log.error("Not able to click chooseFile button");
			}
		}	

		//upload button
		public void clickUploadButton() {
			try {
				Thread.sleep(1000);
				verifyElementPresent(uploadButton);
				uploadButton.click();
				log.info("upload Button Clicked");
			} catch (Exception e) {
				log.error("Not able to click upload button");
			}
		}	
		

		//continue button
		public void clickContinueButton() {
			try {
				Thread.sleep(500);
				verifyElementPresent(continueButton);
				continueButton.click();
				log.info("continue Button Clicked");
			} catch (Exception e) {
				log.error("Not able to click continue button");
			}
		}	
		

		//next button
		public void clickNextButton() {
			try {
				Thread.sleep(500);
				verifyElementPresent(nextButton);
				nextButton.click();
				log.info("next Button Clicked");
			} catch (Exception e) {
				log.error("Not able to click next button");
			}
		}	
		
		

		//next 
		public void clickNext() {
			try {
				Thread.sleep(500);
				verifyElementPresent(next);
				next.click();
				log.info("next1 Button Clicked");
			} catch (Exception e) {
				log.error("Not able to click next1 button");
			}
		}	

		//save 
		public void clickSaveButton() {
			try {
				Thread.sleep(1000);
				verifyElementPresent(saveButton);
				saveButton.click();
				log.info("save Button Clicked");
			} catch (Exception e) {
				log.error("Not able to click save button");
			}
		}	
}
