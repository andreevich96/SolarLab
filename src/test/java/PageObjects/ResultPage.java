package PageObjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class ResultPage {
    private static String initialPriceXPath = "//div[contains(@itemprop, 'price')]";

    public static ElementsCollection getInitialPrices () {
        return $$(elements(byXpath(initialPriceXPath)));
    }

    private static String markerXPath = "//div[@class='loader']";

    public static SelenideElement getMarker () {
        return element(byXpath(markerXPath));
    }

    private static String nextButtonXPath = "//a[@class='page-link next']";

    public static SelenideElement getNextButton () {
        return element(byXpath(nextButtonXPath));
    }

    private static String notificationNumberXPath = "//a[@class='link' and starts-with(text(),'Закупка')]";

    public static ElementsCollection getNotificationNumber () {
        return $$(elements(byXpath(notificationNumberXPath)));
    }

    private static String searchFieldXPath = "//input[contains(@class, 'search__text')]";

    public static SelenideElement getSearchField () {
        return element(byXpath(searchFieldXPath));
    }

    private static String searchNowXPath = "//span[text()=' Найти сейчас ']";

    public static SelenideElement getSearchNow () {
        return element(byXpath(searchNowXPath));
    }

    private static String clearXPath = "//div[contains(@class, 'search-tab__clear')]";

    public static SelenideElement getClearXPath () {
        return element(byXpath(clearXPath));
    }
}
