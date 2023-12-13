package Page;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HaloOglasiUspesnoAktiviranNalogMessagePage extends BaseTest {
    public HaloOglasiUspesnoAktiviranNalogMessagePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(className = "regsitration-success")
    WebElement vasNalogJeUspesnoAktiviranMessage;

    public boolean vasNalogJeUspesnoAktiviranMessageIsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(vasNalogJeUspesnoAktiviranMessage));
        return vasNalogJeUspesnoAktiviranMessage.isDisplayed();
    }
    public String vasNalogJeUspesnoAktiviranMessageGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(vasNalogJeUspesnoAktiviranMessage));
        return vasNalogJeUspesnoAktiviranMessage.getText();
    }
}
