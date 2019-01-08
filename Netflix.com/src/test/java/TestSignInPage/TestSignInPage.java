package TestSignInPage;

import HomePage.HomePage;
import SignInPage.SignInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestSignInPage extends SignInPage{
    SignInPage SignInPage;
    HomePage HomePage;
    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SignInPage = PageFactory.initElements(driver, SignInPage.class);
        HomePage = PageFactory.initElements(driver, HomePage.class);
        HomePage.clickSignInButton();
    }
    @Test (priority=1)
        public void enterEmailAddress(){
        enterEmail("Ilias@yahoo.com");
    }
    @Test (priority=2)
        public void enterSignInPassword(){ enterPassword("abc123"); }
    @Test (priority=3)
        public void clickRememberMe(){
        checkRememberMe();
    }
    @Test (priority = 4)
        public void clickNeedHelpLink(){ needHelp(); }
    @Test (priority = 5)
        public void clickLoginWithFacebook(){loginWithFacebook();}
    @Test (priority = 6)
        public void clickSignUp(){signUpLink();}
    @Test (priority = 7)
        public void ClickGiftCardTerms(){ giftCardTermsLink(); }
    @Test (priority = 8)
        public void clickTermsOfUseSignInPage() { HomePage.clickTermsOfUse(); }
    @Test(priority = 9)
        public void clickPrivacyStatement(){ privacyStatementLink(); }
    @Test (priority = 10)
    public void clickLanguageSignInPage() { HomePage.clickLanguageSelector(); }
    @Test (priority = 11)
    public void clickSignInButtonOnSignInPage() {
        enterEmail("ilias247mohammed@yahoo.com");
        enterPassword("L@k3r$");
        signInButtonSIPButton();
    }
}