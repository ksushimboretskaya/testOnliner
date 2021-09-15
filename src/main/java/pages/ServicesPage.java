package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ServicesPage extends TestBase {

    @FindBy(xpath = "//div[contains(@class,'service-header__title_huge') and text()='Заказы']")
    WebElement servicePagesTittle;

    private boolean verifyServicesPageTittle() {
        return servicePagesTittle.isDisplayed();
    }
}
