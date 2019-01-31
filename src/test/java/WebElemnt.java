import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElemnt {
    public WebElement create_webelement(String BY_INDEX, String Index,WebDriver webDriver) {
        BY_INDEX=BY_INDEX.toLowerCase();
        WebElement elemnt = null;
        if (BY_INDEX.contentEquals("xpath")) {
            elemnt = webDriver.findElement(By.xpath(Index));
        } else if (BY_INDEX.contentEquals("classname")) {
            elemnt = webDriver.findElement(By.className(Index));
        } else if (BY_INDEX.contentEquals("cssselector")) {
            elemnt = webDriver.findElement(By.cssSelector(Index));
        } else if (BY_INDEX.contentEquals("tagname")) {
            elemnt = webDriver.findElement(By.tagName(Index));
        } else if (BY_INDEX.contentEquals("id")) {
            elemnt = webDriver.findElement(By.id(Index));
        } else if (BY_INDEX.contentEquals("linktext")) {
            elemnt = webDriver.findElement(By.linkText(Index));
        } else if (BY_INDEX.contentEquals("name")) {
            elemnt = webDriver.findElement(By.name(Index));
        } else if (BY_INDEX.contentEquals("partiallinktext")) {
            elemnt = webDriver.findElement(By.partialLinkText(Index));
        }

        return elemnt;
    }
}
