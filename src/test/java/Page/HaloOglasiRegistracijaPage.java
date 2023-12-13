package Page;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiRegistracijaPage extends BaseTest {
    public HaloOglasiRegistracijaPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[value=\"person\"]")
    WebElement fizickoLiceCheckbox;

    @FindBy(id = "UserName")
    WebElement korisnickoImeInputField;

    @FindBy(id = "Email")
    WebElement emailInputField;

    @FindBy(name = "Password")
    WebElement lozinkaInputField;

    @FindBy(css = "[backbone-id=\"23\"]")
    WebElement ponoviLozinkuInputField;

    @FindBy(id = "HasAgreedToGetFiscalReceiptByEmail")
    WebElement saglasnostCheckbox;

    @FindBy(css = ".button-reg.save.save-entity.person-face.btn-main")
    WebElement registrujMeButton;

    @FindBy(className = "regsitration-success")
    WebElement uspesnaRegistracijaMessage;



    public void fizickoLiceCheckboxTick() {
        wdWait.until(ExpectedConditions.visibilityOf(fizickoLiceCheckbox));
        if (fizickoLiceCheckbox.isSelected()) {} else {
            wdWait.until(ExpectedConditions.elementToBeClickable(fizickoLiceCheckbox)).click();
        }}

    public void korisnickoImeInputFieldSendKeys(String KorisnickoIme){
        wdWait.until(ExpectedConditions.visibilityOf(korisnickoImeInputField)).clear();
        korisnickoImeInputField.sendKeys(KorisnickoIme);
    }
    public void emailInputFieldSendKeys(String Email){
        wdWait.until(ExpectedConditions.visibilityOf(emailInputField)).clear();
        emailInputField.sendKeys(Email);
    }
    public void lozinkaInputFieldSendKeys(String Password){
        wdWait.until(ExpectedConditions.visibilityOf(lozinkaInputField)).clear();
        lozinkaInputField.sendKeys(Password);
    }
    public void ponoviLozinkuInputFieldSendKeys(String PonoviLozinku){
        wdWait.until(ExpectedConditions.visibilityOf(ponoviLozinkuInputField)).clear();
        ponoviLozinkuInputField.sendKeys(PonoviLozinku);
    }
    public void saglasnostCheckboxTick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(saglasnostCheckbox)).click();
    }
    public void registrujMeButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(registrujMeButton)).click();
    }
    public boolean uspesnaRegistracijaMessageIsDispayed(){
        wdWait.until(ExpectedConditions.visibilityOf(uspesnaRegistracijaMessage));
        return uspesnaRegistracijaMessage.isDisplayed();
    }
    public String uspesnaRegistracijaMessageGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(uspesnaRegistracijaMessage));
        return uspesnaRegistracijaMessage.getText();
    }

}





