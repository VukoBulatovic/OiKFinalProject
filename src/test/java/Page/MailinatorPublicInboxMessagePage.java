package Page;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class MailinatorPublicInboxMessagePage extends BaseTest {
    public MailinatorPublicInboxMessagePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "html_msg_body")
    WebElement iFrameElement;

    @FindBy(xpath = "//strong[contains(text(),'Aktiviraj nalog')]")
    WebElement aktivirajNalogLink;

    public void aktivirajNalogLinkClick(){
        wdWait.until(ExpectedConditions.visibilityOf(iFrameElement));
        driver.switchTo().frame(iFrameElement);
        wdWait.until(ExpectedConditions.visibilityOf(aktivirajNalogLink)).click();
        driver.switchTo().defaultContent();
        String currentWindowHandle = driver.getWindowHandle();
        wdWait.until(ExpectedConditions.numberOfWindowsToBe(2));
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(currentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }
}
