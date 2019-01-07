package HomePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class HomePage extends BaseUtil {
    @FindBy(linkText = "Sign In")
    public static WebElement signInButton;
    public void clickSignInButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signInButton.click();
    }
    @FindBy(xpath = "//span[.='JOIN FREE FOR A MONTH']")
    public static WebElement joinButton;
    public void clickJoinButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        joinButton.click();
    }
    @FindBy(css = "g#three-devices-condensed")
    public static WebElement devicesButton;
    public void clickDevicesLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        devicesButton.click();
        }
    @FindBy(css = "g#icon-price-tag")
    public static WebElement priceButton;
    public void clickPriceLink () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        priceButton.click();
        }
    @FindBy (xpath = "//span[.='FAQ']")
    public static WebElement faqLink;
    public void clickFAQLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        faqLink.click();
            }
    @FindBy (xpath = "//span[.='Account']")
    public static WebElement accountLink;
    public void clickAccountLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        accountLink.click();
    }
    @FindBy (xpath = "//span[.='Investor Relations']")
    public static WebElement investorRelationsLink;
    public void clickInvestorRelationsLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        investorRelationsLink.click();
    }
    @FindBy (xpath = "//span[.='Redeem Gift Cards']")
    public static WebElement redeemGiftCards;
    public void clickRedeemGiftCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        redeemGiftCards.click();
    }
    @FindBy (xpath = "//span[.='Corporate Information']")
    public static WebElement corporateInformation;
    public void clickCorporateInformation() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        corporateInformation.click();
    }
    @FindBy (xpath = "//span[.='Ways to Watch']")
    public static WebElement waysToWatch;
    public void clickWaysToWatch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        waysToWatch.click();
    }
    @FindBy (xpath = "//span[.='Privacy']")
    public static WebElement privacy;
    public void clickPrivacy() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        privacy.click();
    }
}
