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
}
