import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SelTestCase {
    @Test
    public void doTes() {
        System.setProperty("webdriver.chrome.driver", "\\Users\\Asus\\Desktop\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        WebElemnt elemnt = new WebElemnt();
        SearchPage searchPage = new SearchPage();
        FavPage favPage = new FavPage();
        webDriver.get("https://www.n11.com/");
        elemnt.create_webelement("linkText", "Hesabım", webDriver).click();
        elemnt.create_webelement("id", "email", webDriver).sendKeys("mefir12@hotmail.com");
        elemnt.create_webelement("id", "password", webDriver).sendKeys("1287tal");
        elemnt.create_webelement("id", "loginButton", webDriver).click();
        searchPage.doSearchPage(webDriver, elemnt);
        favPage.doFavPage(webDriver, elemnt);

    }
}