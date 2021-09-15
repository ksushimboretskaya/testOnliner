package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogPage extends TestBase {
    @FindBy(xpath = "//*[contains (@class,'catalog-navigation__title') and text() ='Каталог']")
    WebElement catalogPageTittle;

    @FindBy(xpath = "//span[contains(@class,'catalog-navigation-classifier__item-title') and text() ='Электроника']")
    WebElement electronicsLink;

    private boolean verifyCatalogPageTittle() {
        return catalogPageTittle.isDisplayed();
    }

    private boolean verifyElectronicsLink() {
        return electronicsLink.isDisplayed();
    }


}