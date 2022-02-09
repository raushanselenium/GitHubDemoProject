package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {

    WebDriver driver;

    public IndexPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//p[text()='Your trips']")
    WebElement lnkYourTrips;

    @FindBy(xpath = "//button[normalize-space()='Sign in']")
    WebElement btnSignIn;

    public void clickYourTrips()
    {
        lnkYourTrips.click();
    }

    public void clickSignIn()
    {
        btnSignIn.click();
    }


}
