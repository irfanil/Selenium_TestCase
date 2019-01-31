import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class SearchPage {

    public void doSearchPage(WebDriver webDriver, WebElemnt webElemnt) {
        Actions action = new Actions(webDriver);

        webElemnt.create_webelement("id", "searchData", webDriver).click();
        webElemnt.create_webelement("id", "searchData", webDriver).sendKeys("samsung");
        webElemnt.create_webelement("classname", "searchBtn", webDriver).click();
        webElemnt.create_webelement("xpath", "//*[@id=\"contentListing\"]/div/div/div[2]/div[3]/a[2]", webDriver).click();
        List<WebElement> searchrslt = ((ChromeDriver) webDriver).findElementsByClassName("column");
        searchrslt.get(2).findElement(By.xpath("//*[@id=\"p-291761723\"]/div[2]/span[2]")).click();
        action.moveToElement(webElemnt.create_webelement("classname", "myAccount", webDriver)).moveToElement(
                webElemnt.create_webelement("xpath", "//*[@id=\"header\"]/div/div/div[2]/div[2]/div[2]/div[2]/div/a[2]", webDriver)
        )
                .click()
                .build()
                .perform();

    }
}
