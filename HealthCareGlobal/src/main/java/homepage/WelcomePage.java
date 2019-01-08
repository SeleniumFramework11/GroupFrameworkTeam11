package homepage;

import base.BaseUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class WelcomePage extends BaseUtil {

    @FindBy (xpath = "//img[@class='uhc-logo desktop-logo']")
    public static WebElement seeLogo;

    @FindBy (xpath = "//a[@id='menu-icon']")
    public static WebElement menubutton;

    @FindBy (xpath = "//div[@class='menu-right']//div[@class='content']//input[@id='edit-mergevars-name']")
    public static WebElement searchName;

    @FindBy (xpath = "//input[@class='search-button']")
    public static WebElement buttonSearch;

    @FindBy (xpath = "//label[@class='btn-search lbl']")
    public static WebElement searchText;

    @FindBy (id = "q")
    public static WebElement keySearch;

    @FindBy (xpath = "//a[@class='top-menu1']")
    public static WebElement homeButton;

    @FindBy (xpath = "//div[@class='custom-25-75']//a[@href='/individual-and-family']")
    public static WebElement indiviualandFamilies;

    @FindBy (xpath = "//a[@class='top-menu3']")
    public static WebElement employerMenu;

    @FindBy (xpath = "//div[@class='footer-menu-list ']//a[@href='/employer']")
    public static WebElement medicareMenu;

    public void checkseeLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeLogo.click();

    }
    public void checkmenubutton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        menubutton.click();
    }

    public void checksearchName() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchName.click();

    }
    public void checkbuttonSearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        buttonSearch.click();
}
    public void checksearchText() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchText.click();

    }
    public void checkkeySearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        keySearch.click();

    }
    public void checkhomeButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeButton.click();

    }
    public void checkindividualandFamilies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        indiviualandFamilies.click();

    }
    public void checkemployerMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        employerMenu.click();

    }
    public void checkmedicareMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        medicareMenu.click();

    }







}
