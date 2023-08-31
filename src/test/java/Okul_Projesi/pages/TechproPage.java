package Okul_Projesi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Okul_Projesi.utilities.Driver;

public class TechproPage {
    public TechproPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='searchHeaderInput']")
    public WebElement aramaKutusu;

    @FindBy(xpath = "(//*[text()='Mobile Developer'])[2]")
    public WebElement mobileDevLink;

    @FindBy(xpath = "(//*[text()='Free Java'])[4]")
    public WebElement freeJavaLink;

}
