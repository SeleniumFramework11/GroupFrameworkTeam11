package homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class WelcomePage extends base.WelcomePage {

    @FindBy (linkText = "Grocery")
    public static WebElement goForGrocery;

    public void checkgoForGrocery() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        goForGrocery.click();

    }
}

