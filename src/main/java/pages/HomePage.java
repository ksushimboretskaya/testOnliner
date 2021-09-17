package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(className = "onliner_logo")
    WebElement logo;

    @FindBy(xpath = "//span[contains(@class,'b-main-navigation__text')and text() = 'Новости']")
    WebElement newsLink;

    @FindBy(xpath = "//span[contains(@class,'b-main-navigation__text')and text() = 'Каталог']")
    WebElement catalogLink;

    @FindBy(xpath = "//span[contains(@class,'b-main-navigation__text')and text() = 'Услуги']")
    WebElement servicesLink;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public boolean verifyHomePageLogo() {
        return logo.isDisplayed();
    }

    public boolean verifyNewsLink() {
        return newsLink.isDisplayed();
    }

    public boolean verifyCatalogLink() {
        return catalogLink.isDisplayed();
    }

    public boolean verifyServicesLink() {
        return  servicesLink.isDisplayed();
    }

    public ServicesPage clickOnServicesPageLink() {
        servicesLink.click();
        return new ServicesPage();
    }


}
