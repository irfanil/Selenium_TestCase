import org.openqa.selenium.WebDriver;

public class FavPage {

    public void doFavPage(WebDriver webDriver, WebElemnt webElemnt) {

        webElemnt.create_webelement("xpath", "//*[@id=\"myAccount\"]/div[3]/ul/li[1]/div/a/h4", webDriver).click();
        webElemnt.create_webelement("xpath", "//*[@id=\"p-291761723\"]/div[3]/span", webDriver).click();
    }
}
