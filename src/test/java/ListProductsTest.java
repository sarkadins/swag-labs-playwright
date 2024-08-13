import com.codecool.pages.HomePage;
import com.codecool.pages.LoginPage;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListProductsTest {
    private Browser browser;
    private LoginPage loginPage;
    private Page page;
    private String URL = "https://www.saucedemo.com/";
    private HomePage homePage;

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
    }

    @Test
    public void testListProductsByNameAToZ() {
        loginPage.login("standard_user", "secret_sauce");
        homePage.listProductsByNameAToZ();
    }

    @Test
    public void testListProductsByNameZToA() {
        loginPage.login("standard_user", "secret_sauce");
        homePage.listProductsByNameZToA();
    }
    @Test
    public void testListProductsByPriceLowToHigh() {
        loginPage.login("standard_user", "secret_sauce");
        homePage.listProductsByPriceLowToHigh();
    }
    @Test
    public void testListProductsByPriceHighToLow() {
        loginPage.login("standard_user", "secret_sauce");
        homePage.listProductsByPriceHighToLow();
    }
    @AfterEach
    public void tearDown() {
        browser.close();
    }
}
