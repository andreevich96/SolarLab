package PageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.element;

public class Search223Page {
    private static String settingsXPath = "//span[text()='Настроить']";

    public static SelenideElement getSettings () {
        return element(byXpath(settingsXPath));
    }
}
