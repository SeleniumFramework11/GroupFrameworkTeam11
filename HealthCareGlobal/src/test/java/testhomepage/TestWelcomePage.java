package testhomepage;

import homepage.WelcomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestWelcomePage extends WelcomePage {
    WelcomePage welcome;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome = PageFactory.initElements(driver, WelcomePage.class);

    }
    @Test
    public void testseeLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkseeLogo();

    }
    @Test
    public void testmenubutton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkmenubutton();

    }
    @Test
    public void testsearchName() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checksearchName();

    }
    @Test
    public void testbuttonSearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkbuttonSearch();

    }
    @Test
    public void testseatchText() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checksearchText();

    }
    @Test
    public void testkeySearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkkeySearch();

    }
    @Test
    public void testhomeButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkhomeButton();

    }
    @Test
    public void testemployerMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkemployerMenu();

    }
    @Test
    public void testmedicareMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkmedicareMenu();

    }





}
