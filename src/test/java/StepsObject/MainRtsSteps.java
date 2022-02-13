package StepsObject;

import PageObjects.MainRtsPage;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class MainRtsSteps {

    @Given("Open rts-tender.ru")
    public void open_rts_tender_ru() {
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true;
        System.setProperty("webdriver.chrome.driver", "C:\\Program files\\chromedriver.exe");
        Configuration.startMaximized = true;
        open("https://www.rts-tender.ru/");
    }

    @When("User clicks link to 223 suppliers")
    public void user_clicks_link_to_223_suppliers() {
        element(byXpath(MainRtsPage.suppliers223)).click();
    }
}
