package Test;

import Base.BaseTest;
import Page.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HaloOglasiAPImessageTest extends BaseTest {

    HaloOglasiHomePage haloOglasiHomePage;
    HaloOglasiUlogujSePage haloOglasiUlogujSePage;
    HaloOglasiRegistracijaPage haloOglasiRegistracijaPage;
    MailinatorHomePage mailinatorHomePage;
    MailinatorInboxPage mailinatorInboxPage;
    MailinatorPublicInboxMessagePage mailinatorPublicInboxMessagePage;
    HaloOglasiUspesnoAktiviranNalogMessagePage haloOglasiUspesnoAktiviranNalogMessagePage;



    @Before
    public void setUpTest(){
        haloOglasiHomePage = new HaloOglasiHomePage();
        haloOglasiUlogujSePage = new HaloOglasiUlogujSePage();
        haloOglasiRegistracijaPage = new HaloOglasiRegistracijaPage();
        mailinatorHomePage = new MailinatorHomePage();
        mailinatorInboxPage = new MailinatorInboxPage();
        mailinatorPublicInboxMessagePage = new MailinatorPublicInboxMessagePage();
        haloOglasiUspesnoAktiviranNalogMessagePage = new HaloOglasiUspesnoAktiviranNalogMessagePage();

    }

    @Test
    public void haloOglasiSuccessfulRegistrationApiMessageTest(){
        haloOglasiHomePage.cookiesAcceptButtonClick();
        haloOglasiHomePage.ulogujSeButtonClick();
        haloOglasiUlogujSePage.registrujteSeLinkClick();
        haloOglasiRegistracijaPage.fizickoLiceCheckboxTick();
        haloOglasiRegistracijaPage.korisnickoImeInputFieldSendKeys("MarcoPoloVenice1993");
        haloOglasiRegistracijaPage.emailInputFieldSendKeys("marcon1Pol01993g@mailinator.com");
        haloOglasiRegistracijaPage.lozinkaInputFieldSendKeys("Venec1ja");
        haloOglasiRegistracijaPage.ponoviLozinkuInputFieldSendKeys("Venec1ja");
        haloOglasiRegistracijaPage.saglasnostCheckboxTick();
        haloOglasiRegistracijaPage.registrujMeButtonClick();
        Assert.assertTrue(haloOglasiRegistracijaPage.uspesnaRegistracijaMessageIsDispayed());
        Assert.assertEquals( "Registracija je uspela!\n" +
                "Kako bi Vaš nalog postao aktivan, neophodno je da kliknite na link u mejlu koji Vam je poslat na : marcon1Pol01993g@mailinator.com !",
                haloOglasiRegistracijaPage.uspesnaRegistracijaMessageGetText());
        driver.get("https://www.mailinator.com/");
        mailinatorHomePage.publicMailinatorInboxInputFieldSendKeys("marcon1Pol01993g@mailinator.com");
        mailinatorHomePage.goButtonClick();
        mailinatorInboxPage.inboxMessageClick();
        mailinatorPublicInboxMessagePage.aktivirajNalogLinkClick();
        Assert.assertTrue(haloOglasiUspesnoAktiviranNalogMessagePage.vasNalogJeUspesnoAktiviranMessageIsDisplayed());
        Assert.assertEquals("Vaš nalog je uspešno aktiviran!\n" +
                        "Produžite na stranicu za logovanje kako biste pristupili našem portalu. Prijava",
                haloOglasiUspesnoAktiviranNalogMessagePage.vasNalogJeUspesnoAktiviranMessageGetText());
    }

}
