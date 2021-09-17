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

    @Test(priority = 1)
    public void verifyServicesPageTittle() {
        Assert.assertTrue(servicesPage.verifyServicesPageTittle(), "Services page tittle isn't displayed");
    }

    @Test(priority = 2)
    public void verifyOrderLabel() {
        Assert.assertEquals(servicesPage.verifyOrderLabel(), "Мои заказы");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
