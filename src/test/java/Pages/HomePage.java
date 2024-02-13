package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
public class HomePage {
    WebDriver driver;
    WebElement cards;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getCards() {
        return driver.findElements(By.cssSelector(".card.mt-4.top-card"));
    }

    //------------------------------

    public void clickOnCard(String cardName) {
        for (int i = 0; i < getCards().size(); i++) {
            if (getCards().get(i).getText().equals(cardName)) {
                getCards().get(i).click();
                break;
            }
        }
    }
}
