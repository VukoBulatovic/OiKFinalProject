package Page;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiHomePage extends BaseTest {
    public HaloOglasiHomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "cookie-policy-btn")
    WebElement cookiesAcceptButton;

    @FindBy(css = ".header-category-link.login-btn-wrapper")
    WebElement ulogujSeButton;

    public void cookiesAcceptButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(cookiesAcceptButton)).click();
    }

    public void ulogujSeButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(ulogujSeButton)).click();
    }

}
