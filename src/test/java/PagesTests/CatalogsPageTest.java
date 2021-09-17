package PagesTests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.CatalogPage;
import pages.HomePage;

public class CatalogsPageTest extends TestBase {

    CatalogPage catalogPage;
    HomePage homePage;

    @BeforeClass
    public void setUp() {
        initialization();
        homePage = new HomePage();
        catalogPage = new CatalogPage();
        homePage.clickOnCatalogsPageLink();
    }

    @Test(priority = 1)
    public void verifyCatalogPageTittle() {
        Assert.assertTrue(catalogPage.verifyCatalogPageTittle(), "Tittle isn't displayed");
    }

    @Test(priority = 2)
    public void verifyElectronicsLink() {
        Assert.assertTrue(catalogPage.verifyElectronicsLink(), "Electronics link isn't displayed");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
