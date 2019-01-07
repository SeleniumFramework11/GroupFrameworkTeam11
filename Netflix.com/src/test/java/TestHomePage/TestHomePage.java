package TestHomePage;

import HomePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestHomePage extends HomePage {
    HomePage HomePage;
    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Test (priority=1)
    public void testSignInLink() {
            clickSignInButton();
    }
    @Test (priority=2)
    public void testJoinLink(){
        clickJoinButton();
    }
    @Test (priority=3)
    public void testPriceButton(){
        clickPriceLink();
    }
    @Test (priority=4)
    public void testDevicesButton(){
        clickDevicesLink();
    }
    @Test (priority=5)
    public void testGoToFAQLink(){
        clickFAQLink();
    }
    @Test (priority=6)
    public void testGoToAccountLink(){
        clickAccountLink();
    }
    @Test (priority=7)
    public void testGoToInvestorRelations(){
        clickInvestorRelationsLink();
    }
    @Test (priority=8)
    public void testRedeemGiftCardsLink(){
        clickRedeemGiftCards();
    }
    @Test (priority=9)
    public void testCorporateInformationLink(){
        clickCorporateInformation();
    }
    @Test (priority=10)
    public void testPrivacyLink(){
        clickPrivacy();
    }
    @Test (priority=11)
    public void testWaysToWatchLink(){
        clickWaysToWatch();
    }
}
