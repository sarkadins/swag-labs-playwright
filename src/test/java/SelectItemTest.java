import com.codecool.pages.HomePage;
import com.codecool.pages.LoginPage;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.BeforeEach;

public class SelectItemTest {
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

}
