package PageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.element;

public class ParticipantsPage {
    private static String advancedSearchXPath = "//h2[text()='Расширенный поиск']";

    public static SelenideElement getAdvancedSearch () {
        return element(byXpath(advancedSearchXPath));
    }
}
