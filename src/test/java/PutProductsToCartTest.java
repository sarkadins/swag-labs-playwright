import com.codecool.pages.CartPage;
import com.codecool.pages.HomePage;
import com.codecool.pages.LoginPage;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PutProductsToCartTest {
    private Browser browser;
    private LoginPage loginPage;
    private Page page;
    private String URL = "https://www.saucedemo.com/";
    private HomePage homePage;
    private CartPage cartPage;
    private String password = System.getenv("PASSWORD");

    @BeforeEach
    public void setUp() {
        browser = Playwright
                .create()
                .chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
        page.navigate(URL);
        loginPage = new LoginPage(page);
        homePage = new HomePage(page);
        cartPage = new CartPage(page);
    }

    @Test
    public void testPuttingProductsToCart() {
        loginPage.login("standard_user", password);
        homePage.addBackpackToCart();
        homePage.addOnesieToCart();
        homePage.addBikeLightToCart();
        homePage.addBoltTShirtToCart();
        homePage.addFleeceJacketToCart();
        homePage.addTShirtRedToCart();
        homePage.clickOnCartButton();
        Assertions.assertTrue(cartPage.hasBackpackText());
        Assertions.assertTrue(cartPage.hasOneSieText());
        Assertions.assertTrue(cartPage.hasBoltTShirtText());
        Assertions.assertTrue(cartPage.hasFleeceJacketText());
        Assertions.assertTrue(cartPage.hasBikeLightText());
        Assertions.assertTrue(cartPage.hasTShirtRedText());
    }

    @AfterEach
    public void tearDown() {
        browser.close();
    }
}
