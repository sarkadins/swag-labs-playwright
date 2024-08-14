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

public class CheckOutTest {
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
    public void testCheckOut(){
        loginPage.login("standard_user", password);
        homePage.addBoltTShirtToCart();
        homePage.addFleeceJacketToCart();
        homePage.addTShirtRedToCart();
        homePage.clickOnCartButton();
        cartPage.handleOrder();
        String expected = "Thank you for your order!";
        String actual = cartPage.getOrderCompleteMessage();
        Assertions.assertEquals(expected, actual);
    }
    @AfterEach
    public void tearDown() {
        browser.close();
    }
}
