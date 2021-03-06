package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HMCPage;
import utilities.ConfigReader;

public class HotelMyCampStepDefinations {
    HMCPage hmcPage=new HMCPage();

    @Given("login linkine tiklar")
    public void login_linkine_tiklar() {
        hmcPage.mainPageLoginLink.click();
    }
    @Then("kullanici adi olarak {string} girer")
    public void kullanici_adi_olarak_girer(String kullaniciTipi) {
        hmcPage.usernameTextBox.sendKeys(ConfigReader.getProperty(kullaniciTipi));

    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String passwordTuru) {
        hmcPage.passwordTextBox.sendKeys(ConfigReader.getProperty(passwordTuru));

    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
        hmcPage.loginButonu.click();

    }
    @Then("basarili olarak giris yapildigini test eder")
    public void basar8li_olarak_giris_yapildigini_test_eder() {
        Assert.assertTrue(hmcPage.basariliGirisYaziElement.isDisplayed());

    }
    @And("giris yapilamadigini test eder")
    public void girisYapilamadiginiTestEder() {

        Assert.assertTrue(hmcPage.girisYapilamadiYaziElement.isDisplayed());
    }

    @Then("scenario outline'dan kullanici adi olarak {string} yazar")
    public void scenarioOutlineDanKullaniciAdiOlarakYazar(String username) {
        hmcPage.usernameTextBox.sendKeys(username);
    }

    @And("scenario outline'dan password olarak {string} yazar")
    public void scenarioOutlineDanPasswordOlarakYazar(String password) {

        hmcPage.passwordTextBox.sendKeys(password);
    }
}
