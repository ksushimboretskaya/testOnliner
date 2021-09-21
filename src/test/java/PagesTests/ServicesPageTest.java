package PagesTests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;
import pages.ServicesPage;

public class ServicesPageTest extends TestBase {

    ServicesPage servicesPage;
    HomePage homepage;

    public ServicesPageTest() {
        super();
    }

    @BeforeClass
    public void setUp() {
        initialization();
        homepage = new HomePage();
        servicesPage = new ServicesPage();
        homepage.clickOnServicesPageLink();
    }

    @Test(priority = 1 , description = "Verify services page tittle")
    public void verifyServicesPageTittle() {
        Assert.assertTrue(servicesPage.verifyServicesPageTittle(), "Services page tittle isn't displayed");
    }

    @Test(priority = 2, description = "Verify order label", dataProvider = "order-label")
    public void verifyOrderLabel(String expectedOrderLabel) {
        Assert.assertEquals(servicesPage.verifyOrderLabel(), expectedOrderLabel);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @DataProvider(name="order-label")
    public Object[][] orderLabel() {
        return new Object[][]{{"Мои заказы"}};
    }
}
