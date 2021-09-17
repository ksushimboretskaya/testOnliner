package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicesPage extends TestBase {

    @FindBy(xpath = "//div[contains(@class,'service-header__title_huge') and text()='Заказы']")
    WebElement servicePagesTittle;

    @FindBy(xpath = "//span[contains(text(),'Мои заказы')]")
    WebElement orderLabel;

    public ServicesPage () {
        PageFactory.initElements(driver,this);
    }

    public boolean verifyServicesPageTittle() {
        return servicePagesTittle.isDisplayed();
    }

    public String verifyOrderLabel(){
        return orderLabel.getText();
    }
}
