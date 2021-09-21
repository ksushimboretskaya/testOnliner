package PagesTests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;

public class HomePageTest extends TestBase {

    HomePage homePage;

    public HomePageTest() {
        super();
    }

    @BeforeClass
    public void setUp() {
        initialization();
        homePage = new HomePage();
    }

    @Test(priority = 1, description = "Verify home page logotype")
    public void verifyHomePageLogo() {
        Assert.assertTrue(homePage.verifyHomePageLogo(), "Logotype isn't displayed");
    }

    @Test(priority = 2, description = "Verify services page link")
    public void verifyServicesPageLink() {
        Assert.assertTrue(homePage.verifyServicesLink(), "Services link isn't displayed");
    }

    @Test(priority = 3, description = "Verify catalog page link")
    public void verifyCatalogPageLink() {
        Assert.assertTrue(homePage.verifyCatalogLink(), "Catalogs page link isn't displayed");
    }

    @Test(priority = 4, description = "Verify news page link")
    public void verifyNewsPageLink() {
        Assert.assertTrue(homePage.verifyNewsLink(), "News page link isn't displayed");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
