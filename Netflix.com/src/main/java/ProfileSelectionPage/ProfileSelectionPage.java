package ProfileSelectionPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileSelectionPage {
    @FindBy (linkText = "Netflix")
    public static WebElement netflixLogo;
    public void netflixLogoLink(){
        netflixLogo.click();
    }
}
