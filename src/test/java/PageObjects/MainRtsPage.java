package PageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.element;

public class MainRtsPage {
    private static String suppliers223XPath = "//nav[contains(@class, 'nav nav-223')]/ul/li[1]/a[text()='Поставщикам']";

    public static SelenideElement getSuppliers223 () {
        return element(byXpath(suppliers223XPath));
    }
}
