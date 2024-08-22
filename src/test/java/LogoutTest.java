import com.codecool.pages.HomePage;
import com.codecool.pages.LoginPage;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class LogoutTest {
    private Browser browser;
    private LoginPage loginPage;
    private Page page;
    private String URL = "https://www.saucedemo.com/";
    private HomePage homePage;
    private String password = System.getenv("PASSWORD");

    @BeforeEach
    public void setUp() {
        browser = Playwright
                .create()
                .chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(true));
        page = browser.newPage();
        page.navigate(URL);
        loginPage = new LoginPage(page);
        homePage = new HomePage(page);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "logout-data.csv", numLinesToSkip = 1)
    public void testLogout(String username) {
      try{
          loginPage.login(username, password);
          homePage.logout();
          String expected = "Login";
          String actual = loginPage.getLoginBtnText();
          Assertions.assertEquals(expected, actual);
      } catch (Exception e){
          e.printStackTrace();
      }
    }
    @AfterEach
    public void tearDown() {
        browser.close();
    }
}
