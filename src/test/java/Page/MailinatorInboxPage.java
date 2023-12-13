package Page;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MailinatorInboxPage extends BaseTest {
    public MailinatorInboxPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "[class=\"ng-scope\"]")
    WebElement inboxMessage;

    public void inboxMessageClick(){
        wdWait.until(ExpectedConditions.visibilityOf(inboxMessage)).click();
    }

}
