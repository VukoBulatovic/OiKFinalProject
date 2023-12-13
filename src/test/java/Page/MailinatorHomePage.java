package Page;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MailinatorHomePage extends BaseTest {
    public MailinatorHomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "[id=\"search\"]")
    WebElement publicMailinatorInboxInputField;

    @FindBy(css = "[onclick=\"changeInbox('search'); return false;\"]")
    WebElement goButton;


    public void publicMailinatorInboxInputFieldSendKeys(String registrationMailUsedForHaloOglasi){
        wdWait.until(ExpectedConditions.visibilityOf(publicMailinatorInboxInputField)).clear();
        publicMailinatorInboxInputField.sendKeys(registrationMailUsedForHaloOglasi);
    }
    public void goButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(goButton)).click();
    }

}
